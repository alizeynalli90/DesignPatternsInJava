package design.patterns.creational.singleton;

public class SingltonSyncronized {

	private static SingltonSyncronized object;
	
	//Here using synchronized makes sure that only one thread at a time can execute getInstance()
	public static synchronized SingltonSyncronized getInstance() {
		return object == null ? new SingltonSyncronized() : object;
	}

}
