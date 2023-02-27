package multithread.pkware.com;

class Thread1 extends Thread {
	public void run() {
		System.out.println("Thread1");
	}
	
	
}

class Thread2 extends Thread {
	public void run() {
		System.out.println("Thread2");
	}
	
	
}

class Thread3 extends Thread {
	public void run() {
		System.out.println("Thread3");
	}
	
	
}

public class PriorityThread {

	public static void main(String[] args) {
		Thread1 obj1=new Thread1();
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		
		Thread3 obj3=new Thread3();
		obj3.setPriority(Thread.MIN_PRIORITY);
		obj3.start();
		
		Thread2 obj2=new Thread2();
		obj2.start();
		

	}

}
