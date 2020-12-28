package design.patterns.structural.facade;

public class ShapeFacade {
	
	private Shape circle;

	private Shape rectangular;
	
	private Shape square;

	public ShapeFacade() {
		this.circle = new Circle();
		this.rectangular = new Rectangular();
		this.square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangular() {
		rectangular.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}

}
