package multithread.pkware.com;
class MyThr extends Thread{
	public MyThr(String name) {
		super(name);
	}
	
	public void run() {
//		int i=0;
//		while(i<30000) {
			System.out.println("I am a thread");
//			i++;
//		}
	}
}
public class ConstructorThread {

	public static void main(String[] args) {
		MyThr obj=new MyThr("akshat");
		obj.start();
		System.out.println("Id of thread is "+ obj.getId());
		System.out.println("Id of thread is "+ obj.getName());
		

	}

}
