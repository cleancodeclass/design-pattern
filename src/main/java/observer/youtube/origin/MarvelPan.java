package observer.youtube.origin;

public class MarvelPan {
	private String name = "MarvelPan";
	
	public void update(String publisher, String title) {
		System.out.print("Hi~ " + name + ". ");
		System.out.println(publisher + " uploaded new contents '" + title + "'.");
	}
}
