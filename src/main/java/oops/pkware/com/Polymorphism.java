package oops.pkware.com;
interface Camera2{
	void takesnap();
	void recordvideo();
	private void greet() { 
		System.out.println("Good Morning");
	}
	default void recording4kVideo() {
		greet();
		System.out.println("Recording 4k Video");
	}
}

interface Wifi2{
	String[] getNetworks();
	void connectToNetwork();
}

class CellPhone2{
	
	void callnumber(int number) {
		System.out.println("Calling Number "+number);
	}
	
	void pickcall() {
		System.out.println("Picking Call");
	}


}

class SmartPhone2 extends CellPhone2 implements Camera2,Wifi2{

	public void takesnap() {
		System.out.println("Taking Snap");
	}
	public void recordvideo() {
		System.out.println("Recording Video");
	}
	
	public String[] getNetworks() {
		String[] networks= {"Hello","Network"};
		return networks;
	}
	public void connectToNetwork() {
		System.out.println("Connecting to network");
	}
	
}

public class Polymorphism {

	public static void main(String[] args) {
		Camera2 vivo=new SmartPhone2();
//		vivo.getNetworks(); This will not work because we're taking reference of
//		Camera 2
		
		vivo.recording4kVideo();
		
		SmartPhone2 iphone=new SmartPhone2();
		iphone.recording4kVideo();
		iphone.connectToNetwork();
	}

}
