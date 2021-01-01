package design.patterns.behavioral.state;

public class Start implements State {


	   public void doThis(Context context) {
	      System.out.println("Player is in start state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Start State";
	   }
}
