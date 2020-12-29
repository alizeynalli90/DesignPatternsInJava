package design.patterns.creational.builder;

public class Bottle implements Packing {

	public String pack() {
		System.out.println("Bottle");
		return "Bottle";
	}

}
