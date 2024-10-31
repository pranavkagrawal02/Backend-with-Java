package maps;
import java.util.LinkedHashMap;
public class LinkedHashMapExample {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<String, Integer>();
		evenNumbers.put("TWO", 2);
		evenNumbers.put("FOUR", 4);
		System.out.println(evenNumbers);
		
		LinkedHashMap<String, Integer> numbers = new LinkedHashMap<String, Integer>(evenNumbers);
		numbers.put("SIX", 6);
		System.out.println(numbers);
		
		numbers.put.fAbsert("SIX", 6);
		numbers.putIfAbsent("EIGHT", 8);
		System.out.println(numbers);
	}
}