package maps;
import java.util.NavigableMap;
import java.util.TreeMap;


public class NavigableMapExample {
	public static void main(String[] args) {
	
		NavigableMap<String, Integer> numbers = new TreeMap<String, Integer>();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		
		System.out.println(numbers);
		
		System.out.println(numbers.firstEntry());
		System.out.println(numbers.lastEntry());
		
		System.out.println(numbers.pollFirstEntry());
		System.out.println(numbers.pollLastEntry());
	}

}

