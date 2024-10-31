package collections;
import java.util.LinkedList;
public class LinkedListExample {
	public static void main(String[] args) {
	
	LinkedList<String> linkedList = new LinkedList<String>();
	System.out.println(linkedList.size());
	linkedList.add("Java");
	linkedList.add("Python");
	linkedList.add("JavaScript");
	linkedList.add("C#");
	
	System.out.println(linkedList);
	
	linkedList.add(2, "C++");
	linkedList.remove(0); linkedList.remove("JavaScript");
	System.out.println(linkedList);
	System.out.println(linkedList.size());
	}
}