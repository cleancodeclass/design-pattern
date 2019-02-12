package observer.youtube.case1;

//TODO 1.2. Observer 를 implement 합니다.
public class SpiderManPan {
	
	private String name = "SpiderManPan";
	
	//TODO 1.3. @Override를 선언하여 Observer 인터페이스의 오버라이딩 메소드임을 표현한다.
	//TODO 1.4. Observer 인터페이스에 public void update(String publisher, String title) 를 선언합니다.
	public void update(String publisher, String title) {
		System.out.print("Hi~ " + name + ". ");
		System.out.println(publisher + " uploaded new contents '" + title + "'.");
	}
}
