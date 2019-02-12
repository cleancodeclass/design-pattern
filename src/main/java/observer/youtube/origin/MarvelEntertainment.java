package observer.youtube.origin;                         
                                                         
public class MarvelEntertainment{                        
	                                                       
	private String name = "MarvelEntertainment";           
                                                         
	public String getName() {                              
		return name;                                         
	}                                                      
                                                         
	public void uploadContents(String title) {             
		System.out.println(name + " uploaded "+ title + ".");
		                                                     
		// 2. 구독자가 컨텐츠 업로드에 대한 알림을 받습니다. 
		MarvelPan marvelPan = new MarvelPan();               
		marvelPan.update(name, title);                       
                                                         
		SpiderManPan spiderManPan = new SpiderManPan();      
		spiderManPan.update(name, title);                    
	}                                                      
}                                                        
