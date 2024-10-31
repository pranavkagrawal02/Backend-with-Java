package maps;
import java.util.WeakHashMap;

public class WeakHashMapExample {
	public static void main(String[] args) {
		
		WeakHashMap<String, Integer> numbers = new WeakHashMap<String, Integer>();
		
		numbers.put("ONE", 1);
		numbers.put("TWO", 2);
		numbers.put("THREE", 3);
		
		System.out.println(numbers);
		
		String four = new String("FOUR");
		
		Integer fourValue = 4;
		
		numbers.put(four, fourValue); System.out.println(numbers);
		
		four = null;
		
		
		System.gc();
		
		System.out.println(numbers);
		
	}
}