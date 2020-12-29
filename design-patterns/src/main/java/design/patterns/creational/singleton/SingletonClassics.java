package design.patterns.creational.singleton;

public class SingletonClassics {
	
	private static SingletonClassics object;
	
	public static SingletonClassics getInstance() {
		return object == null ? new SingletonClassics() : object;
	}

}
