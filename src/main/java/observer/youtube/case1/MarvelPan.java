package observer.youtube.case1;

//TODO 01. 구독자의 인터페이스 Observer를 생성합니다.
//TODO 02. Observer 를 implement 합니다.
public class MarvelPan {
	
	private String name = "MarvelPan";
	
	//TODO 03. @Override를 선언하여 Observer 인터페이스의 오버라이딩 메소드임을 표현한다.
	//TODO 04. Observer 인터페이스에 public void update(String publisher, String title) 를 선언합니다.
	public void update(String publisher, String title) {
		System.out.print("Hi~ " + name + ". ");
		System.out.println(publisher + " uploaded new contents '" + title + "'.");
	}
}
