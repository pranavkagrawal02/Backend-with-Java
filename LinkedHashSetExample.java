import java.util.ArrayList; 
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
	
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		
		System.out.println(evenNumbers);
		
		// LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>(evenNumbers);
		// System.out.println(numbers);
		
		LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
		
		numbers.addAll(evenNumbers);
		
		numbers.add(8);
		
		System.out.println(numbers);
		
		Iterator<Integer> iterator = numbers.iterator(); 
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(numbers.remove(2));
		System.out.println(numbers.removeAll(numbers));
		
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		
		set1.add(2);
		set1.add(4);
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		
		set2.add(2);
		set2.add(4);
		set2.add(6);
		
		// set1.addAll(set2);
		// System.out.println(set1);
		// set1.retainAll(set2);
		// System.out.println(set1);
		
		
		set2.removeAll(set1);
		System.out.println(set2);
		}
}