package design.patterns.structural.proxy;

public class RealImage implements Image {
	
	private String filename;

	
	public RealImage(String filename) {
		this.filename = filename;
		loadFromDisk(filename);
	}

	public void display() {
		System.out.println("displaying filename: "+filename);

	}
	
	public void loadFromDisk(String filename) {
		System.out.println("loading "+filename);
	};

}
