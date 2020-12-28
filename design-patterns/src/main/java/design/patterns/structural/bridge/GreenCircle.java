package design.patterns.structural.bridge;

public class GreenCircle implements DrawAPI {

	public void drawCircle(int radius, int x, int y) {
	System.out.println("green circle is drawn for:"+x+y+radius);

	}

}
