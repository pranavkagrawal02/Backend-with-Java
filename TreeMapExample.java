package maps;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> numbers = new TreeMap<String, Integer>();
		
		numbers.put("ONE", 1);
		numbers.put("TWO", 2);
		numbers.put("ThREE", 3);
		
		numbers.putIfAbsent("THREE", 3);
		numbers.putIfAbsent("FOUR", 4);
		
		System.gc();
		
		System.out.println(numbers);
		
		System.out.println(numbers.keySet());
		
		System.out.println(numbers.values()); System.out.println(numbers.entrySet());
	}
}