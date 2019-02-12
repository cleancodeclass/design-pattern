package observer.youtube.case2;

import java.util.Observable;
import java.util.Observer;

public class MarvelPan implements Observer{
	
	private String name = "MarvelPan";
	
	public void update(String publisher, String title) {
		System.out.print("Hi~ " + name + ". ");
		System.out.println(publisher + " uploaded new contents '" + title + "'.");
	}

	@Override
	public void update(Observable o, Object arg) {
		String title = (String)arg;
		String publisher = ((MarvelEntertainment)o).getName();
		update(publisher, title);
	}
}
