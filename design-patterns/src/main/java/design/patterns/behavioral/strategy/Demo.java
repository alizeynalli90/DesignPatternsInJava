package design.patterns.behavioral.strategy;

public class Demo {
	
	public static void main(String[] args) {
	      Context context = new Context(new Add());		
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new Substract());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new Multiply());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
