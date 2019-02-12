package observer.restaurant;

import java.util.Observable;
import java.util.Observer;

public class MailSender implements Observer{

	public void sendMail(Schedule schedule) {
		// send mail
	}
	
	@Override
	public void update(Observable o, Object arg) {
		Schedule schedule = (Schedule) arg;
		if(schedule.getCustomer().getEmail() != null){
			sendMail(schedule);
		}
	}
}
