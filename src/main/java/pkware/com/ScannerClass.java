package pkware.com;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		System.out.println("Taking input from user: ");
		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int sum=a+b;
//		System.out.println(sum);
		String str=sc.next(); // it will print string before space
		String str1=sc.nextLine(); // it will print whole string
		System.out.println(str);
		System.out.println(str1);
//		System.out.println(sc.hasNextInt());

	}

}
