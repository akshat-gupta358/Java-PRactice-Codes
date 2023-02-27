package frameworks.pkware.com;
import java.util.*;

public class PriorityQueueIntro {

	public static void main(String[] args) {
		PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
		q.add(10);// By default it work on min heap
		q.add(30);
		q.add(50);
		q.add(20);
		q.add(40);
		
		q.offer(60);
		
		System.out.println(q);
		while(!q.isEmpty()) {
			System.out.print(q.poll()+" ");
			System.out.println(q);
		}

	}

}
