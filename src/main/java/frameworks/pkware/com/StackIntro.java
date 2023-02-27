package frameworks.pkware.com;
import java.util.*;

public class StackIntro {

	public static void main(String[] args) {

		Stack <Integer> st=new Stack<>();
		
		st.push(45);
		st.push(23);
		st.push(12);
		st.push(56);
		
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		
		System.out.println(st.search(12)); // It starts from 1
		
		st.add(53434);
		System.out.println(st);
		
		System.out.println(st.capacity()); 	
		Object copy_vector = st.clone();
		
		System.out.println(copy_vector);
		
		st.set(0, 300);
		System.out.println(st.contains(300));
		System.out.println(st.hashCode());
		System.out.println(st.subList(0, 3));

	}

}
