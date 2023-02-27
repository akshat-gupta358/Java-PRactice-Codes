package frameworks.pkware.com;

import java.util.ArrayList;

public class ArrayListRemoveRange extends ArrayList<Integer>{

	public static void main(String[] args) {
		ArrayListRemoveRange l1=new ArrayListRemoveRange();
		l1.add(5);
		l1.add(2);
		l1.add(65);
		l1.add(3);
		
		l1.removeRange(0, 1);
		System.out.println(l1);
		
		ArrayList<Integer> l2=new ArrayList<>(5);
		l2.add(4);
		l2.add(5);
		l2.add(2);
		
		l2.retainAll(l1);
		System.out.println(l1);
		System.out.println(l2);
		
		

	}

}
