package sets;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	
	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet<String>();
		set.add("India");
		set.add("Australia");
		set.add("South Africa");
		set.add("Japan");
		set.add("India");
		
		System.out.println(set);
		
		Iterator<String> iterator set.iterator(); 
		while(iterator.hasNext()) { 
			System.out.println(iterator.next()); 
		}
		
		System.out.println(set.contains("India"));
		
		System.out.println(set.first());
		
		System.out.println(set.last());
		
		System.out.println(set.remove("Japan")); 
		
		System.out.println(set.removeAll(set));
	}
}
