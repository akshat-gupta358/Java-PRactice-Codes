package frameworks.pkware.com;
import java.util.*;

class Comp implements Comparator<String>{
	@Override
	public int compare(String str1, String str2){
		return str2.compareTo(str1);
	}
}

public class PriorityQueueComparator {

	public static void main(String[] args) {
		
		PriorityQueue<String> q=new PriorityQueue<String>(new Comp());
		
		q.add("A");
		q.add("K");
		q.add("S");
		q.add("H");
		q.add("A");
		q.add("T");
		
		System.out.println(q);
	}

}
