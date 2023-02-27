package pkware.com;
import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number for factorial: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int fact=1;
		for(int i=num;i>0;i--) {
			fact*=i;
		}
		System.out.println(fact);

	}

}
