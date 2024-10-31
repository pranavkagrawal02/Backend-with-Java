package maps;

import java.util.SortedMap;
import java.util.TreeMap;
	
public class SortedMapExample {
	public static void main(String[] args) {
		SortedMap<String, Integer> numbers = new TreeMap<String, Integer>();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		
		System.out.println(numbers);
		System.out.println(numbers.firstKey());
		System.out.println(numbers.lastKey());
		System.out.println(numbers.remove("One"));
	}
}