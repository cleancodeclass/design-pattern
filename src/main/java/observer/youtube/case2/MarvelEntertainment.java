package observer.youtube.case2;

// TODO 3. java.util.Observable 를 extends합니다.
public class MarvelEntertainment{
	
	private String name = "MarvelEntertainment";

	public String getName() {
		return name;
	}

	public void uploadContents(String title) {
		System.out.println(name + " uploaded "+ title + ".");

		// TODO 5. MarvelEntertainment객체의 상태가 변경되었음을 'setChanged()' 메소드를 활용하여 Observale에 알립니다.
		
		// TODO 6. 구독자가 컨텐츠 업로드에 대한 알림을 받습니다.

	}
}
