package design.patterns.structural.proxy;

public class Demo {

	public static void main(String[] args) {
		
		Image image = new ProxyImage("proxy.file");
		image.display();
		image.display();
		
	}

}
