package observer.youtube.origin;

public class Main {
	
	private static String title = "SpiderMan homecoming";
	
	// 게시자가 콘텐츠를 업로드 한후 구독자가 알림을 받습니다.
	public static void main(String[] args) {
		
		// 0. 게시자가 채널을 생성합니다.
		MarvelEntertainment marvelEntertainment = new MarvelEntertainment();
		
		// 1. 게시자가 콘텐츠를 업로드합니다.
		marvelEntertainment.uploadContents(title);
		
	}
}
