package multithread.pkware.com;

class MyRunnableInterface implements Runnable{
	public void run() {
		System.out.println("I am a thread");
	}
}
class MyRunnableInterface2 implements Runnable{
	public void run() {
		System.out.println("I am a thread2");
	}
}
public class RunnableInterface {

	public static void main(String[] args) {
		MyRunnableInterface bullet1=new MyRunnableInterface();
		Thread gun1=new Thread(bullet1);
	
		MyRunnableInterface2 bullet2=new MyRunnableInterface2();
		Thread gun2=new Thread(bullet2);
		gun1.start();
		gun2.start();
	}

}
