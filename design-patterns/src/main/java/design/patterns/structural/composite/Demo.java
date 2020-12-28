package design.patterns.structural.composite;

public class Demo {
	
	public static void main(String[] args) {
		Employee ceo = new Employee("Ali Zeynalli", "ceo office", 60000);
		Employee cto = new Employee("Cani Zeynalli", "ceo office", 60000);
		Employee accountant1 = new Employee("Ilyas Zeynalli", "ceo office", 50000);
		Employee accountant2 = new Employee("Kemale Zeynalli", "ceo office", 40000);
		ceo.add(cto);
		cto.add(accountant1);
		cto.add(accountant2);
		
		for (Employee employee : ceo.getSubordinates()) {
			System.out.println(employee);
		}
	}

}
