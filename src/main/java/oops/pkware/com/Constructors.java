package oops.pkware.com;
class Employee2{
	private int id;
	private String name;
	public Employee2(int a, String n) {
		id=a;
		name=n;
		
	}
	public Employee2( String n) {
		id=0;
		name=n;
		
	}
	public Employee2() {
		id=0;
		name="Akshat";
		
	}
	
	public void getid() {
		System.out.println("Your id is "+id+" "+ name);
	}
}
public class Constructors {

	public static void main(String[] args) {
		Employee2 akshat=new Employee2();
		akshat.getid();

	}

}
