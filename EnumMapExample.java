package maps;
import java.util.EnumMap;

public class EnumMapExample {
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE 
	}
	public static void main(String[] args) {
		EnumMap<Size, Integer> sizes = new EnumMap (Size.class);
		
		sizes.put(Size.SMALL, 20); 
		sizes.put(Size.MEDIUM, 30); 
		sizes.put(Size.LARGE, 40); 
		Java SortedMap Interface
		sizes.put(Size.EXTRALARGE, 50); 
		
		System.out.println(sizes); 
		
		System.out.println(sizes.keySet()); 
		System.out.println(sizes.values()); 
		
		System.out.println(sizes.entrySet()); 
		
		System.out.println(Size.MEDIUM);	
	}
}