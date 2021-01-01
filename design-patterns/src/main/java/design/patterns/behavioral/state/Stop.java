package design.patterns.behavioral.state;

public class Stop implements State {

	   public void doThis(Context context) {
	      System.out.println("Player is in stop state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Stop State";
	   }
	}
