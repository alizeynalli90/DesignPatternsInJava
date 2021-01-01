package design.patterns.behavioral.iterator;

public class Demo {

	public static void main(String[] args) {
	     NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 
	}

}
