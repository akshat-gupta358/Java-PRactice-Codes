package exception.pkware.com;

public class TryAndCatch {

	public static void main(String[] args) {
		int a = 6000;
        int b = 0;
        
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {
            System.out.println("We failed to divide.");
            System.out.println(e);
        }
        System.out.println("End");

	}

}
