package exception.pkware.com;

import java.util.Scanner;

public class NestedException {

	public static void main(String[] args) {
		int[] marks=new int[3];
		marks[0]=35;
		marks[1]=35;
		marks[2]=12;
		
		
		try {
			
		
		System.out.println("hi");
		
		try {
			System.out.println(marks[10]);
		}
		
		catch(Exception e) {
			System.out.println("This is exception lvl 2");
		}
		}
		

		catch(Exception e) {
			System.out.println("Exception lvl 1");
		}

	}

}
