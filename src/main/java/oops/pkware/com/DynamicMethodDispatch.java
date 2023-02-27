package oops.pkware.com;
class Phone{
	
	public void akshat() {
		System.out.println("I am Method akshat2");
	}
}

class Smartphone extends Phone{
	@Override
	public void akshat() {
		System.out.println("I am Method of Smartphone class"); //It'll be executed runtime
	}
	public void music() {
		System.out.println("Playing Music");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Phone obj=new Smartphone();
		obj.akshat();
//		obj.music(); It is not allowed

	}

}
