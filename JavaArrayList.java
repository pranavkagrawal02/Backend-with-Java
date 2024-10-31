package collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("King");
		list.add("Shreya");
		list.add("Sarah");
		System.out.println("Size of ArrayList: + list.size());
		System.out.println(list);
		list.remove(0);
		for(String value: list) {
		System.out.println(value);
	}
}