package observer.youtube.case1;

//TODO 05. Observer 를 implement 합니다.
public class SpiderManPan {
	
	private String name = "SpiderManPan";
	
	//TODO 06. @Override를 선언하여 Observer 인터페이스의 오버라이딩 메소드임을 표현한다.
	public void update(String publisher, String title) {
		System.out.print("Hi~ " + name + ". ");
		System.out.println(publisher + " uploaded new contents '" + title + "'.");
	}
}
