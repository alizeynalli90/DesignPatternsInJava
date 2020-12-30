package design.patterns.behavioral.visitor;

public class Monitor implements ComputerPart {

	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}
