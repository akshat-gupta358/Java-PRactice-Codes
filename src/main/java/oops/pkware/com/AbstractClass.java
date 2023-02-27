package oops.pkware.com;

abstract class Base2{
	Base2(){
		System.out.println("I am constructor of Base2");
	}
	
	public void hello() {
		System.out.println("Hello");
	}
	
	abstract public void greet();
}

class Derived2 extends Base2{
	@Override
	public void greet() {
		System.out.println("Good Morning!");
	}
}

abstract class Derived3 extends Base2{
	public void hello() {
		System.out.println("Hello");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		
		//We cannot make objects of abstract classes but we can reference them 
		
		Derived2 obj=new Derived2();
		obj.greet();
		
	}

}
