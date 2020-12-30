package design.patterns.behavioral.template;

public class Demo {

	public static void main(String[] args) {
	      Game game = new Circket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();
	}

}
