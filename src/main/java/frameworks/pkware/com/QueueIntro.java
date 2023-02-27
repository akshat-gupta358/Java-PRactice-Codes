package frameworks.pkware.com;
import java.util.*;
public class QueueIntro {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<>();
		
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		
		q.remove();
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.contains(3));
		System.out.println(q.poll()); // Also remove the element of queue
	}

}
