package helloworld.patternhell;

public class MessageBodyBuilder extends Builder{
	private MessageBody messageBody = new MessageBody();

	public void buildMessageBody(String... message){
		messageBody.configure(message);
	}

	public MessageBody getResult(){
		return messageBody;
	}
}
