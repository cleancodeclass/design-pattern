package observer.restaurant;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.RETURNS_MOCKS;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BookingSchedulerTest {

	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormat.forPattern("YYYY/MM/dd HH:mm");
	private static final DateTime ON_THE_HOUR = DATE_TIME_FORMATTER.parseDateTime("2017/06/19 17:00");
	private static final DateTime NOT_ON_THE_HOUR = DATE_TIME_FORMATTER.parseDateTime("2017/06/19 17:05");
	private static final Customer CUSTOMER_WITHOUT_EMAIL = mock(Customer.class);
	private static final Customer CUSTOMER_WITH_EMAIL = mock(Customer.class, RETURNS_MOCKS);
	private static final int CAPACITY_PER_HOUR = 3;
	private static final int UNDER_CAPACITY = 1;
	@InjectMocks
	@Spy
	private BookingScheduler bookingScheduler = new BookingScheduler(CAPACITY_PER_HOUR);
	@Spy
	private List<Schedule> addedSchedules = new ArrayList<>();
	private MailSender mailSender = spy(new MailSender());
	@Spy
	private SmsSender smsSender = new SmsSender();
	
	@Before
	public void setUp(){
		bookingScheduler.addObserver(smsSender);
		bookingScheduler.addObserver(mailSender);
	}
	
	@Test(expected = RuntimeException.class)
	public void throwAnExceptionWhenBookingTimeIsNotOnTheHour() throws Exception {
		//arrange
		Schedule schedule = new Schedule(NOT_ON_THE_HOUR, UNDER_CAPACITY, CUSTOMER_WITHOUT_EMAIL);
		
		//act
		bookingScheduler.addSchedule(schedule);
		
		//assert
		//expected runtime exception
	}
	
	@Test
	public void scheduleIsAddedWhenBookingTimeIsOnTheHour() throws Exception {
		//arrange
		Schedule schedule = new Schedule(ON_THE_HOUR, UNDER_CAPACITY, CUSTOMER_WITHOUT_EMAIL);
		
		//act
		bookingScheduler.addSchedule(schedule);
		
		//assert
		assertThat(bookingScheduler.hasSchedule(schedule), is(true));
	}
	
	@Test 
	public void	throwAnExceptionWhenCapacityIsOver() throws Exception {
		//arrange
		Schedule fullSchedule = new Schedule(ON_THE_HOUR, CAPACITY_PER_HOUR, CUSTOMER_WITHOUT_EMAIL);
		addedSchedules.add(fullSchedule);
		
		try{
			//act
			Schedule newSchedule = new Schedule(ON_THE_HOUR, UNDER_CAPACITY, CUSTOMER_WITHOUT_EMAIL);
			bookingScheduler.addSchedule(newSchedule);
			fail();
		}catch(RuntimeException e){
			//assert
			assertThat(e.getMessage(), is("Number of people is over restaurant capacity per hour"));
		}
	}

	@Test 
	public void scheduleCanBeAddedWhenCapacityOfDiffrentHourIsFull() throws Exception{
		//arrange
		Schedule fullSchedule = new Schedule(ON_THE_HOUR, CAPACITY_PER_HOUR, CUSTOMER_WITHOUT_EMAIL);
		addedSchedules.add(fullSchedule);
		
		//act
		DateTime differentHour = ON_THE_HOUR.plusHours(1);
		Schedule newSchedule = new Schedule(differentHour, UNDER_CAPACITY, CUSTOMER_WITHOUT_EMAIL);
		bookingScheduler.addSchedule(newSchedule);
		
		//assert
		assertThat(bookingScheduler.hasSchedule(newSchedule), is(true));
	}
	
	@Test 
	public void	sendSmsWhenScheduleIsAdded() throws Exception {
		//arrange
		Schedule schedule = new Schedule(ON_THE_HOUR, UNDER_CAPACITY, CUSTOMER_WITHOUT_EMAIL);
		
		//act
		bookingScheduler.addSchedule(schedule);
		
		//assert
		verify(smsSender, times(1)).send(any(Schedule.class));
	}
	
	@Test 
	public void	notSendEmailToCustomerWhoDosentHaveEmailWhenScheduleIsAdded() throws Exception {
		//arrange
		Schedule schedule = new Schedule(ON_THE_HOUR, UNDER_CAPACITY, CUSTOMER_WITHOUT_EMAIL);
		
		//act
		bookingScheduler.addSchedule(schedule);
		
		//assert
		verify(mailSender, never()).sendMail(any(Schedule.class));
	}
	
	@Test 
	public void sendEmailToCustomerWhoHasEmailWhenScheduleIsAdded() throws Exception {
		//arrange
		Schedule schedule = new Schedule(ON_THE_HOUR, UNDER_CAPACITY, CUSTOMER_WITH_EMAIL);
		
		//act
		bookingScheduler.addSchedule(schedule);
		
		//assert
		verify(mailSender, times(1)).sendMail(any(Schedule.class));
	}
	
	@Test
	public void throwAnExceptionOnSunday() throws Exception {
		//arrange
		DateTime sunday = DATE_TIME_FORMATTER.parseDateTime("2017/06/18 17:00");
		when(bookingScheduler.getNow()).thenReturn(sunday);
		try {
			// act
			Schedule newSchedule = new Schedule(ON_THE_HOUR, UNDER_CAPACITY, CUSTOMER_WITHOUT_EMAIL);
			bookingScheduler.addSchedule(newSchedule);
			fail();
		} catch (RuntimeException e) {
			// assert
			assertThat(e.getMessage(), is("Booking system is not available on sunday"));
		}
	}
	
	@Test
	public void scheduleShouldBeAddedOnAnyDaysExceptSunday() throws Exception {
		//arrange
		DateTime monday = DATE_TIME_FORMATTER.parseDateTime("2017/06/19 17:00");
		doReturn(monday).when(bookingScheduler).getNow();
		
		//act
		Schedule newSchedule = new Schedule(ON_THE_HOUR, UNDER_CAPACITY, CUSTOMER_WITHOUT_EMAIL);
		bookingScheduler.addSchedule(newSchedule);
		
		//assert
		assertThat(bookingScheduler.hasSchedule(newSchedule), is(true));
	}
}