package pkware.com;

public class PassingReferenceOfArray {
	static void change(int[] a) {
		a[0]=84;
		
	}

	public static void main(String[] args) {
		
		int[] marks= {4,56,34,65};
		change(marks);
		System.out.println(marks[0]);
	}

}
