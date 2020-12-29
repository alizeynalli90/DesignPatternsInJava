package design.patterns.creational.factory;

public class Demo {

	public static void main(String[] args) {

		ShapeFactory factory = new ShapeFactory();
		
		Shape circle = factory.getShape("circle");
		circle.draw();
		
		Shape square = factory.getShape("square");
		square.draw();

		Shape rectangular = factory.getShape("foo");
		rectangular.draw();

	}

}
