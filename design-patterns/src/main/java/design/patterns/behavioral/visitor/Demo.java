package design.patterns.behavioral.visitor;

public class Demo {

	public static void main(String[] args) {
	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	}
}
