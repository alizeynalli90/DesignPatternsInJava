package design.patterns.structural.bridge;

public class Circle extends Shape {
	
	private int x,y,radius;
	
	public Circle(int x, int y, int radius, DrawAPI drawApi) {
		super(drawApi);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
