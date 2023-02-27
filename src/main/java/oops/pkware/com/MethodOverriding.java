package oops.pkware.com;

class A{
	public int akshat() {
		public int a;
		return 4;
	}
	
	public void akshat2() {
		System.out.println("I am Method akshat2");
	}
}

class B extends A{
	@Override
	public void akshat2() {
		System.out.println("I am Method akshat2 of B class");
	}
	public void akshat3() {
		System.out.println("I am Method akshat3 of B class");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		B obj=new B();
		obj.akshat2();
		

	}

}
