package design.patterns.behavioral.strategy;

public class Multiply implements Strategy {

	public int calculate(int num1, int num2) {
		return num1*num2;
	}

}
