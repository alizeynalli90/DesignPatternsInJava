package design.patterns.behavioral.strategy;

public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2) {
		return strategy.calculate(num1, num2);
	}
	
}