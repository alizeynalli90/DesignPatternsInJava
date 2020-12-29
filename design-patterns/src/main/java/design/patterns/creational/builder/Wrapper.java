package design.patterns.creational.builder;

public class Wrapper implements Packing {

	public String pack() {
		System.out.println("Wrapper");
		return "Wrapper";
	}

}
