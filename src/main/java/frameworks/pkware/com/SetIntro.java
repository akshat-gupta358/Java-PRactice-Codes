package frameworks.pkware.com;
import java.util.*;

public class SetIntro {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(20);
		set.add(40);
		set.add(30);
		
		System.out.println(set);
		System.out.println(set.hashCode());
		
		Iterator<Integer> i=set.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println(set.parallelStream());
		

		set.removeIf(a->(a%20==0));
		
		System.out.println(set);
		
	}

}
