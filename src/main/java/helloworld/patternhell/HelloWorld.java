package helloworld.patternhell;

public class HelloWorld {
	public static void main(String[] args) {
		
		MessageBodyBuilder builder = new MessageBodyBuilder();
		Director director = new Director(builder);
		director.construct("Hello", " ", "World", "!");
		MessageBody mb = builder.getResult();
		
		AbstractStrategyFactory asf = DefaultFactory.getInstance();
		MessageStrategy strategy = asf.createStrategy(mb);
		mb.send(strategy);
	}
}