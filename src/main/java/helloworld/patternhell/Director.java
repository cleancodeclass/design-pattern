package helloworld.patternhell;

public class Director{
	private Builder builder;

	public Director(Builder builder){
		this.builder = builder;
	}

	public void construct(String... message){
		builder.buildMessageBody(message);
	}
}
