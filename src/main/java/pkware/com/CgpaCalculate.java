package pkware.com;
import java.util.Scanner;

public class CgpaCalculate {

	public static void main(String[] args) {
		float a=45;
		float b=95;
		float c=48;
		float d=(a+b+c)/30;
		System.out.println(d);
		
		System.out.println("Enter your Name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Your name is "+name+" Gupta");
	}

}
