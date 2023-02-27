package frameworks.pkware.com;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetIntro {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		LinkedHashSet<Integer> set2=new LinkedHashSet<>();
		
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(20);
		set.add(40);
		set.add(30);
		
		set2.add(30);
		set2.add(10);
		
		System.out.println(set);
		System.out.println(set.hashCode());
		
		Iterator<Integer> i=set.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println(set.parallelStream());
		

		set.removeIf(a->(a%20==0));
		
		System.out.println(set);
		System.out.println(set2.equals(set));
		
		set.removeAll(set2);
		System.out.println(set);
	}

}
