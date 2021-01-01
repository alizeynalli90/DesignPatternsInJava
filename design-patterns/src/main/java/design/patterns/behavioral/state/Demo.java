package design.patterns.behavioral.state;

public class Demo {

	public static void main(String[] args) {
	      Context context = new Context();

	      Start startState = new Start();
	      startState.doThis(context);

	      System.out.println(context.getState().toString());

	      Stop stopState = new Stop();
	      stopState.doThis(context);

	      System.out.println(context.getState().toString());
	}

}
