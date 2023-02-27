package oops.pkware.com;

class Employee{
	int id;
	String name;
	public void details() {
		System.out.println("My id is "+id+" and my name is "+name);
	}
	
}

public class OopsClass {

	public static void main(String[] args) {
		Employee akshat=new Employee();
		akshat.id=12;
		akshat.name="Akshat";
		System.out.println(akshat.id);
		System.out.println(akshat.name);
		akshat.details();

	}

}
