package oops.pkware.com;

interface Bicycle{
	int a=45;
	void brake(int decrement);
	void speedup(int increment);
	
	
}

class HeroCycle implements Bicycle{
	public void brake(int decrement) {
		System.out.println("Applying brake");
		
	}
	
	public void speedup(int increment) {
		System.out.println("Speeding up");
	}
}
public class Interface {

	public static void main(String[] args) {
		HeroCycle obj=new HeroCycle();
		obj.brake(5);
		
		//WE can create properties in interfaces but cannot change it
		System.out.println(obj.a);

	}

}
