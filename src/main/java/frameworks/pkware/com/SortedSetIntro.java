package frameworks.pkware.com;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

public class SortedSetIntro {

	public static void main(String[] args) {
		SortedSet<Integer> set=new TreeSet<>(Comparator.reverseOrder());
		SortedSet<Integer> set2=new TreeSet<>();
		
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
		
		System.out.println(set.headSet(20)); // It return strictly headed than the element
		System.out.println(set.subSet(50, 10)); //Second element is not included
		
		System.out.println(set.tailSet(20));//Tailed elements from element
	}

}
