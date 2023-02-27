package oops.pkware.com;
interface Camera{
	void takesnap();
	void recordvideo();
	private void greet() { // We cannot implement private method 
		//but it'll help in clearing and getting invoked in default method
		System.out.println("Good Morning");
	}
	default void recording4kVideo() {
		greet();
		System.out.println("Recording 4k Video");
	}
}

interface Wifi{
	String[] getNetworks();
	void connectToNetwork();
}

class CellPhone{
	
	void callnumber(int number) {
		System.out.println("Calling Number "+number);
	}
	
	void pickcall() {
		System.out.println("Picking Call");
	}


}

class SmartPhone extends CellPhone implements Camera,Wifi{

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

public class DefaultMethods {

	public static void main(String[] args) {
		SmartPhone iphone=new SmartPhone();
		String[] networks=iphone.getNetworks();
		for(String item:networks) {
			System.out.println(item);
		}
		iphone.recording4kVideo();
 
	}

}
