package design.patterns.structural.facade;

public class Demo {

	public static void main(String[] args) {
		ShapeFacade shape = new ShapeFacade();
		shape.drawCircle();
		shape.drawRectangular();
		shape.drawSquare();
	}

}
