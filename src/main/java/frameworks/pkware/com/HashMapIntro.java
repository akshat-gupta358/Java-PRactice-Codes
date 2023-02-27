package frameworks.pkware.com;
import java.util.*;

public class HashMapIntro {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<>();
		m.put(1,"Akshat");
		m.put(2,"Shivam");
		m.put(3,"Vishal");
		m.put(4,"Rohan");
		
		System.out.println(m);
		
		m.compute(1, (key,val)->val.concat(" Gupta"));
		System.out.println(m);
		m.computeIfAbsent(5, val ->"Rahul");
		System.out.println(m);
		
		m.computeIfPresent(3, (key,val)->val.concat(" Sharma"));
		
		System.out.println(m);

	}

}
