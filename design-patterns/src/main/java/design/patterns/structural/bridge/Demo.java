package design.patterns.structural.bridge;

public class Demo {

	public static void main(String[] args) {
		Shape redShape = new Circle(100, 100, 10, new RedCircle());
		Shape greenShape = new Circle(100, 100, 10, new GreenCircle());

		redShape.draw();
		greenShape.draw();
	}

}
