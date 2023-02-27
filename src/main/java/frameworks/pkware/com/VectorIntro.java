package frameworks.pkware.com;
import java.util.*;

public class VectorIntro {

	public static void main(String[] args) {
		
		Vector<Integer> vec=new Vector<Integer>(10);
		vec.add(45);
		vec.add(12);
		vec.add(65);
		vec.add(12);
		vec.add(665);
		vec.add(1, 5343);
		
		System.out.println(vec);
		
		vec.addElement(565); // It increases space by 1
		
		System.out.println(vec.capacity());
		
		System.out.println(vec.firstElement());
		
		vec.forEach((n) -> System.out.println(n));
		
		System.out.println(vec.hashCode());

	}

}
