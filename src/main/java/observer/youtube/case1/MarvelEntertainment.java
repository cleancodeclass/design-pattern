package observer.youtube.case1;

// TODO 08. Subject 인터페이스를 생성하여 implements 합니다.
public class MarvelEntertainment{
	
	private String name = "MarvelEntertainment"; 
	// TODO 07. 구독자목록을 관리할 'List<Observer>' 타입의 필드(subscribers)를 생성합니다.
	
	public String getName() {
		return name;
	}
	
	public void uploadContents(String title) {
		System.out.println(name + " uploaded "+ title + ".");
		
		// TODO 12. 구독자가 컨텐츠 업로드에 대한 알림을 받습니다.
		
	}
	
	// TODO 09. 구독자를 추가할 메소드 public void addObserver(Observer subscriber)를 @Override를 사용하여 선언하고 구현합니다.

	// TODO 10. 구독자를 삭제할 메소드 public void deleteObserver(Observer subscriber)를 @Override를 사용하여 선언하고 구현합니다.

	// TODO 11. 구독자에세 noti할 메소드 public void notifyObservers(String title)를 @Override를 사용하여 선언하고 구현합니다.
}
