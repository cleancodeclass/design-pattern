package observer.youtube.case2;

//TODO 01. java.util.Observer 를 implements 합니다.
public class MarvelPan {
	
	private String name = "MarvelPan";
	
	public void update(String publisher, String title) {
		System.out.print("Hi~ " + name + ". ");
		System.out.println(publisher + " uploaded new contents '" + title + "'.");
	}
	
	//TODO 02. update(Observable o, Object arg)를 Override 합니다.
	//TODO 09. update(Observable o, Object arg)를 구현합니다.
	
}
