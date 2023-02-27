package oops.pkware.com;

class Employee1{
	private int id;
	public void setid(int n) {
		id=n;
	}
	
	public void getid() {
		System.out.println("Your id is "+id);
	}
}
public class AccessModifiers {

	public static void main(String[] args) {
		Employee1 akshat=new Employee1();
		akshat.setid(5);
		akshat.getid();

	}

}
