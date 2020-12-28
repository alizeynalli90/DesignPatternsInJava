package design.patterns.structural.flyweight;

public class Circle implements Shape {
	
	private String color;
	
	private int x,y,radius;

	public Circle(String color) {
		this.color =color;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("drawing: circle "+x+" "+y+" "+radius+" ");

	}

}
