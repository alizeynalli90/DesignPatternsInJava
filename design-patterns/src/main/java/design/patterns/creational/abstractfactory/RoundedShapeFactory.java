package design.patterns.creational.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory {
	  
	@Override
	   public Shape getShape(String shapeType){    
	      if(shapeType.equalsIgnoreCase("Rectangular")){
	         return new RoundedRectangular();         
	      }else if(shapeType.equalsIgnoreCase("Square")){
	         return new RoundedSquare();
	      }	 
	      return null;
	   }
}
