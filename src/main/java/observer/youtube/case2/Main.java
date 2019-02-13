package observer.youtube.case2;

// problem2. JDK 에서 제공하는 observer 기능을 활용해 보세요.
public class Main {
	
	private static String title = "SpiderMan homecoming";
	
	public static void main(String[] args) {
		// 게시자가 채널을 생성합니다.
		MarvelEntertainment marvelEntertainment = new MarvelEntertainment();
		
		// TODO 08. 구독자가 구독을 합니다.
		
		// 게시자가 콘텐츠를 업로드합니다.
		marvelEntertainment.uploadContents(title);

	}
}
