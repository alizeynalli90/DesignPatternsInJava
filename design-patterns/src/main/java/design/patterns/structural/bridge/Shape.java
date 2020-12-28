package design.patterns.structural.bridge;

public abstract class Shape {
	
	public DrawAPI drawAPI;
	
	public Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();

}
