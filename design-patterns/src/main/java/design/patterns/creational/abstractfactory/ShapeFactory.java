package design.patterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	   @Override
	   public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("Rectangular")){
	         return new Rectangular();         
	      }else if(shapeType.equalsIgnoreCase("Square")){
	         return new Square();
	      }	 
	      return null;
	   }

}
