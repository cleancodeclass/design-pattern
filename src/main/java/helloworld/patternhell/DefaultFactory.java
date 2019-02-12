package helloworld.patternhell;

public class DefaultFactory extends AbstractStrategyFactory {
	private static DefaultFactory instance;

	private DefaultFactory() {
	}

	public static AbstractStrategyFactory getInstance() {
		if (instance == null){
			instance = new DefaultFactory();
		}
		return instance;
	}

	public MessageStrategy createStrategy(final MessageBody mb) {
		return new PlainMessageStrategy(mb);
	}
}