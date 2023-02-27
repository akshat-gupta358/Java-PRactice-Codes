package frameworks.pkware.com;

import java.util.*;

public class LinkedListIntro {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		LinkedList<Integer> l2=new LinkedList<>();
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
		l1.addLast(54);
		
		
		l1.addAll(l2);
		
		
		
//		l1.clear();
		l2=(LinkedList)l1.clone();
		
		l1.set(0, 35);
		l1.remove(4);
		
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
	
		
		System.out.println(l1.contains(2));
		System.out.println(l1.isEmpty());
		System.out.println(l1.indexOf(4));
		System.out.println(l1.lastIndexOf(4));
		l1.addFirst(232);
		System.out.println(l1);
		
		Iterator x=l1.descendingIterator();
		
		while(x.hasNext()) {
			System.out.println(x.next());
		}
		
		System.out.println(l1.element());
		
		ListIterator y=l1.listIterator(1);
		
		while(y.hasNext()) {
			System.out.println(y.next());
		}
		l1.offerFirst(45);
		l1.offerLast(54);
		System.out.println(l1);
		
		
		System.out.println(l1.pop()); //It retrieves and remove the first element
	}

}
