package oops.pkware.com;

class Class{
	int x;
	Class(int x){
		this.x=x;
	}
	
	public void display() {
		System.out.println(x);
	}
}

public class ThisSuper {

	public static void main(String[] args) {
		Class obj=new Class(5);
		obj.display();
		
	}

}
