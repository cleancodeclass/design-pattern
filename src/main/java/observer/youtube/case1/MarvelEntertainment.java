package observer.youtube.case1;

import java.util.ArrayList;
import java.util.List;

public class MarvelEntertainment implements Subject{
	
	private String name = "MarvelEntertainment";
	private List<Observer> subscribers = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	
	public void uploadContents(String title) {
		System.out.println(name + " uploaded "+ title + ".");
		
		// 3. 구독자가 컨텐츠 업로드에 대한 알림을 받습니다.
		notifyObservers(title);
	}
	
	@Override
	public void addObserver(Observer subscriber){
		subscribers.add(subscriber);
	}
	
	@Override
	public void deleteObserver(Observer subscriber){
		subscribers.remove(subscriber);
	}
	
	@Override
	public void notifyObservers(String title){
		for (Observer subscriber : subscribers) {
			subscriber.update(name, title);
		}
	}

}
