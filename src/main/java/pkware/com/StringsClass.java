package pkware.com;
import java.util.Scanner;

public class StringsClass {

	public static void main(String[] args) {
		String s="Akshat";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Last Name: ");
		String s1=sc.nextLine();
		String s2=s.toUpperCase();
		System.out.println("Your Name is "+ s+ " "+s1);
		int len=s1.length();
		System.out.println(s2+ len);
		
		// String cannot be changed but reference can
		String name="    Akshat ";
		name=name.trim();
		System.out.println(name);
		System.out.println(name.substring(3));
		System.out.println(name.substring(2,5));
		System.out.println(name.replace('h', 't'));
		System.out.println(name.startsWith("Aks"));
		System.out.println(name.equalsIgnoreCase("AKSHAT"));
	}

}
