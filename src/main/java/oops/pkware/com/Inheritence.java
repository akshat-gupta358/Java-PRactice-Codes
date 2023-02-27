package oops.pkware.com;

class Base{
	int x;
	public Base() {
		x=10;
	}
	
	public void printing() {
		System.out.println("Value of x is "+x);
	}
}

class Derived extends Base {
	int y;
	public Derived() {
		y=40;
	}
	
	public void print() {
		System.out.println("Value of y is "+y);
	}
	
	
}
public class Inheritence {

	public static void main(String[] args) {
		Derived obj=new Derived();
		obj.printing();
		

	}

}
