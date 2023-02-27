package frameworks.pkware.com;
import java.util.*;

public class MapsIntro {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<>();
		Map<String,Integer> m1=new HashMap<>();
		
		Set<String> s=new HashSet<>();
		m.put("Akshat", 1);
		m.put("Shivam", 2);
		m.put("Vishal", 3);
		m.put("Rohan", 4);
		
		m1.put("Bhuvi", 5);
		m1.put("Aryan",6);
		m1.put("Anmol",7);
		
		
		
		
		
		System.out.println(m.containsKey("Akshat"));
		System.out.println(m.containsValue(2));
		
		System.out.println(m.entrySet());
		System.out.println(m);
		System.out.println(m.get("Shivam"));
		s=m.keySet();
		System.out.println(s);
		System.out.println(m.values());
		System.out.println(m.toString());
		
		System.out.println(m.getOrDefault("Rohan", 500));
		
		m.putIfAbsent("Rohit", 5); 
		
	}

}
