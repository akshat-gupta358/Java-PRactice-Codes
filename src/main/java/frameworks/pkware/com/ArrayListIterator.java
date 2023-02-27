package frameworks.pkware.com;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>(5);
		l1.add(5);
		l1.add(2);
		l1.add(65);
		l1.add(3);

		ListIterator<Integer> iterator=l1.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		ListIterator<Integer> iterator2=l1.listIterator(2);
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		l1.removeIf(n-> (n%5==0));
		System.out.println(l1);
		
//		l1.removeRange(0,1);
	}

}
