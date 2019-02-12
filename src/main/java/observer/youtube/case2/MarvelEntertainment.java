package observer.youtube.case2;

import java.util.Observable;

public class MarvelEntertainment extends Observable{
	
	private String name = "MarvelEntertainment";

	public String getName() {
		return name;
	}

	public void uploadContents(String title) {
		System.out.println(name + " uploaded "+ title + ".");
		
		// 3. 구독자가 컨텐츠 업로드에 대한 알림을 받습니다.
		setChanged();
		notifyObservers(title);
	}
}
