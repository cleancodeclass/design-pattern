package helloworld.patternhell;

public class PlainMessageStrategy implements MessageStrategy {
	MessageBody body;

	public PlainMessageStrategy(MessageBody mb) {
		body = mb;
	}

	public void sendMessage() {
		Iterator it = body.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.print((String) obj);
		}
		System.out.println();
	}
}