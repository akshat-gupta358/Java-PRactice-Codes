package multithread.pkware.com;

class StringRunnable implements Runnable{

	
	public void run() {
		System.out.println("I am a thread");
	
		}
	
}

class RunnableClass extends Thread {
	public RunnableClass(Runnable r1, String name) {
		super(name);
	}
	
}

public class RunnableWithString {

	public static void main(String[] args) {
		StringRunnable t1=new StringRunnable();
		Thread r1=new Thread(t1);
		r1.start();
		
		RunnableClass obj=new RunnableClass(r1,"akshat");
		System.out.println(obj.getName());

	}

}
