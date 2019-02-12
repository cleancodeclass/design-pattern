package helloworld.patternhell;

public abstract class AbstractStrategyFactory {
	public abstract MessageStrategy createStrategy(MessageBody mb);
}