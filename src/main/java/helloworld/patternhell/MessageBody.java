package helloworld.patternhell;

public class MessageBody implements Aggregate{
	Object[] payload;
	private int last = 0;
	
	public Object getPayload(int index) {
		return payload[index];
	}

	public void configure(Object[] message) {
		payload = message;
		last = payload.length; 
	}

	public void send(MessageStrategy ms) {
		ms.sendMessage();
	}
	
	public int size() {
		return last;
	}

	@Override
	public Iterator iterator() {
		return new MessageBodyIterator(this);
	}
}
