package frameworks.pkware.com;
import java.util.*;

public class DequeIntro {

	public static void main(String[] args) {
		Deque<Integer> q=new ArrayDeque<Integer>(4);
		
		q.addFirst(45);// It can throw exception
		q.addLast(534);
		q.addFirst(234);
		q.addLast(87);
		q.offerFirst(12); // It will return false if not possible and don't throw exception
		q.addLast(34);
		
		System.out.println(q);
		System.out.println(q.contains(543));
		System.out.println(q.peek());
		
		System.out.println(q.parallelStream());
		System.out.println(q.stream());

	}

}
