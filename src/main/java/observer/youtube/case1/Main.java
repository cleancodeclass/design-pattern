package observer.youtube.case1;

// problem1. observer pattern을 구현해보세요.
public class Main {
	
	private static String title = "SpiderMan homecoming";
	
	public static void main(String[] args) {
		// 게시자가 채널을 생성합니다.
		MarvelEntertainment marvelEntertainment = new MarvelEntertainment();
		
		// TODO 13. 구독자가 구독을 합니다.
		
		// 게시자가 콘텐츠를 업로드합니다.
		marvelEntertainment.uploadContents(title);

	}
}
