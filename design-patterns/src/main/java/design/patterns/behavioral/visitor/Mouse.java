package design.patterns.behavioral.visitor;

public class Mouse implements ComputerPart {

	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}
