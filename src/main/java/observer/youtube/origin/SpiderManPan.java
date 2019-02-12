package observer.youtube.origin;

public class SpiderManPan {
	private String name = "SpiderManPan";
	
	public void update(String publisher, String title) {
		System.out.print("Hi~ " + name + ". ");
		System.out.println(publisher + " uploaded new contents '" + title + "'.");
	}
}
