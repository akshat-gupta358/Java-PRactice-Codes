package multithread.pkware.com;

class MyThread extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<30000) {
			System.out.println("My thread is running");
			System.out.println("My thread is running");
			i++;
		}
	}
}

class MyThread2 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<30000) {
			System.out.println("My thread2 is running");
			System.out.println("My thread2 is running");
			i++;
		}
	}
}

public class Threading {

	public static void main(String[] args) {
		MyThread obj1=new MyThread();
		MyThread2 obj2=new MyThread2();
		
		obj1.start();
		obj2.start();
	}

}
