package design.patterns.creational.builder;

public abstract class ColdDrink implements Item {

	public abstract String name();

	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();

}
