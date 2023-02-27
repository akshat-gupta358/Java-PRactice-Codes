package exception.pkware.com;

public class FinallyKeyword {
	public static int func() {
		try {
			int a=5;
			int b=2;
			int c=a/b;
			return c;
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("End of Function");
		}
		
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(func());

	}

}
