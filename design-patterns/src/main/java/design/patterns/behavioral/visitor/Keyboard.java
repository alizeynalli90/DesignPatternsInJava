package design.patterns.behavioral.visitor;

public class Keyboard implements ComputerPart {

	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }

}
