package exception.pkware.com;
import java.util.*;
class MyException extends Exception{
	@Override
	public String toString() {
		return super.toString()+"This is toString()";
	}
	
	@Override
	public String getMessage() {
		return super.getMessage()+"This is getMessage()";
	}
}

public class ExceptionClass {

	public static void main(String[] args) {
		
		int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        if(a<9) {
        	try {
        		//throw new MyException();
        		
        		throw new ArithmeticException("This is not valid");
        	}
        	
        	catch(Exception e) {
        		System.out.println(e.getMessage());
        		System.out.println(e.toString());
        		System.out.println(e);
        		e.printStackTrace();
        		
        		System.out.println("Finished");
        	}
        	
        	System.out.println("Yes it is Finished");
        }
	}

}
