package design.patterns.creational.prototype;

public class EmployeeRecord implements Prototype {
	 
	private String name, designation;
	   
	public EmployeeRecord() {
		System.out.println("+++Employee Records+++");
	}   
	

	public EmployeeRecord(String name, String designation) {
		this();
		this.name = name;
		this.designation = designation;
	}   
	
	public void showRecord() {
		System.out.println(name + " " + designation);
	}

	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new EmployeeRecord(name, designation);
	}

}
