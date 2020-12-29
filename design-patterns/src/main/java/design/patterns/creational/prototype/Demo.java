package design.patterns.creational.prototype;

public class Demo {

	public static void main(String[] args) {
		EmployeeRecord record = new EmployeeRecord("test1","test2"); 
		EmployeeRecord recordClone = (EmployeeRecord) record.getClone();
		recordClone.showRecord();
	}
}
