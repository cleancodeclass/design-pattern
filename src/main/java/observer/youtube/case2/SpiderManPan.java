package observer.youtube.case2;

//TODO 03. java.util.Observer 를 implements 합니다.
public class SpiderManPan {
	
	private String name = "SpiderManPan";
	
	public void update(String publisher, String title) {
		System.out.print("Hi~ " + name + ". ");
		System.out.println(publisher + " uploaded new contents '" + title + "'.");
	}
	
	//TODO 04. update(Observable o, Object arg)를 Override 합니다.
	//TODO 10. update(Observable o, Object arg)를 구현합니다.
	
}
