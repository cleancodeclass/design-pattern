package observer.restaurant;

import java.util.Observable;
import java.util.Observer;

public class SmsSender implements Observer{

	public void send(Schedule schedule) {
		// send message to PhoneNumber
	}

	@Override
	public void update(Observable o, Object arg) {
		send((Schedule) arg);
	}
}
