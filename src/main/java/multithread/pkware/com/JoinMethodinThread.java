package multithread.pkware.com;

class Thread4 extends Thread {
	public void run() {
		System.out.println("Thread4");
	}
	
	
}

class Thread5 extends Thread {
	public void run() {
		System.out.println("Thread5");
	}
	
	
}


public class JoinMethodinThread {

	public static void main(String[] args) {
		
		Thread4 obj4=new Thread4();
		obj4.start();
		try {
			
			obj4.join();
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		
		Thread5 obj5=new Thread5();
		obj5.start();

	}

}
