package exception.pkware.com;
import java.util.*;

public class SpecificException {

	public static void main(String[] args) {
		int[] marks=new int[3];
		
		marks[0]=35;
		marks[1]=35;
		marks[2]=12;
		
		Scanner sc=new Scanner(System.in);
		
		int ind=sc.nextInt();
		int num=sc.nextInt();
		
		try {
			
		
		System.out.println(marks[ind]);
		System.out.println(marks[ind]/num);
		}
		
		catch(ArithmeticException e) {
			System.out.print("arithmetic exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bound");
		}

	}

}
