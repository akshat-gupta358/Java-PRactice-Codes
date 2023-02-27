package pkware.com;

public class MethodOverloading {
	static void greet() {
		System.out.println("Good Morning!");
		
	}
	
	static void greet(String name) {
		System.out.println("Good Morninng! "+name);
	}
	static void greet(String firstname,String lastname) {
		System.out.println("Good Morninng! "+firstname+" "+lastname);
	}
	

	public static void main(String[] args) {
		greet();
		greet("Akshat");
		greet("Akshat","Gupta");

	}

}
