package design.patterns.structural.bridge;

public class RedCircle implements DrawAPI {

	public void drawCircle(int radius, int x, int y) {
		System.out.println("red circle is drawn for:"+x+y+radius);
	}

}
