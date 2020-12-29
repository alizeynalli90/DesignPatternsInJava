package design.patterns.creational.factory;

public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if(shapeType == "circle") {
			return new Circle();
		}else if(shapeType == "square") {
			return new Square();
		} else {
			return new Rectangular();
		}
	}

}
