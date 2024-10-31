package sets;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
	
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		
		System.out.println(numbers);
		
		Iterator<Integer> iterate numbers.iterator(); 
		
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		System.out.println(numbers.remove(300));
		System.out.println(numbers.removeAll(numbers));
		
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set.add(100);
		set1.add(200);
		set1.add(300);
		set.add(400);
		
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(100);
		set2.add(200);
		set2.add(300);
		set2.add(400);
		set2.add(500);
		
		
		set1.addAll(set2);
		System.out.println(set1);
		
		
		* set1.addAll(set2); System.out.println(set1);
		/*
		* set1.retainAll (set2); System.out.println(set1);
		*/
		
		
		set2.removeAll(set);
		System.out.println(set1);
	}
}