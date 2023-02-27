package oops.pkware.com;

class Base1{
	private int x;
	public Base1(){
		System.out.println("Base class Constructor");
	}
	Base1(int a){
		x=a;
		System.out.println(x);
	}
}

class Derived1 extends Base1{
	Derived1(){
		super(5);
		System.out.println("Derived class Constructor");
	}
	Derived1(int x,int y){
		super(y);
		System.out.println("Derived "+x+ y);
	}
}

public class ConstructorsInheritence {

	public static void main(String[] args) {
		
		Derived1 obj=new Derived1(4,5);
		
	}

}
