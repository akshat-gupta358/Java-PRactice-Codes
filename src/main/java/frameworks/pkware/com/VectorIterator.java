package frameworks.pkware.com;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIterator {

	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>(10);
		vec.add(45);
		vec.add(12);
		vec.add(65);
		vec.add(12);
		vec.add(665);
		vec.add(1, 5343);
		
		Iterator <Integer> itr=vec.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator <Integer> li=vec.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}

	}

}
