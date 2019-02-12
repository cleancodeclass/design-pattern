package observer.youtube.case1;

public class SpiderManPan implements Observer{
	
	private String name = "SpiderManPan";
	
	@Override
	public void update(String publisher, String title) {
		System.out.print("Hi~ " + name + ". ");
		System.out.println(publisher + " uploaded new contents '" + title + "'.");
	}
}
