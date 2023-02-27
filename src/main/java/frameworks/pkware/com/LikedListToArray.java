package frameworks.pkware.com;
import java.util.*;

public class LikedListToArray {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(5);
		l1.add(2);
		l1.add(65);
		l1.add(3);
		
		Object[] a=l1.toArray();
		
		for(Object element:a) {
			System.out.println(element);
		}

	}

}
