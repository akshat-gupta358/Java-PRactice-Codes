package frameworks.pkware.com;
import java.util.*;

public class ArrayListIntro {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>(5);
		ArrayList<Integer> l2=new ArrayList<>(2);
		l1.add(5);
		l1.add(2);
		l1.add(65);
		l1.add(3);
		
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		
		l1.add(1,3);
		l1.add(0,4);
		
		l1.addAll(l2);
		
		
		
//		l1.clear();
		l2=(ArrayList)l1.clone();
		
		l1.set(0, 35);
		l1.remove(4);
		
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
	
		
		System.out.println(l1.contains(2));
		System.out.println(l1.isEmpty());
		System.out.println(l1.indexOf(4));
		System.out.println(l1.lastIndexOf(4));
	}

}
