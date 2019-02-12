package helloworld.patternhell;

public class MessageBodyIterator implements Iterator {

	private MessageBody messageBody;
	private int cursor;
	
	public MessageBodyIterator(MessageBody messageBody) {
		this.messageBody = messageBody;
		this.cursor = 0;
	}

	@Override
	public boolean hasNext() {
		return cursor != messageBody.size();
	}
	
	@Override
	public Object next() {
		return messageBody.getPayload(cursor++);
	}

}
