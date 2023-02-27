package pkware.com;

public class ArraysJava {

	public static void main(String[] args) {
//		int[] marks=new int[5];
		int[] marks= {10,30,43,45};
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		for(int element:marks) {
			System.out.println(element);
		}
	}

}
