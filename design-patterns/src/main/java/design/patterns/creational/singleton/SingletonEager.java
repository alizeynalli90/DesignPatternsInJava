package design.patterns.creational.singleton;

public class SingletonEager {
	
	private static SingletonEager object = new SingletonEager();
	
	private SingletonEager() {};
	
	public static SingletonEager getInstance() {
		return object;
	}

}
