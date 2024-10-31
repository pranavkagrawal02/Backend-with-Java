import java.util.HashSet;
import java.util. Iterator;
import java.util.Set;


public class SetExample {
	
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		
		System.out.println(set1);
			
		Iterator<Integer> iterate setl.iterator(); 
		while(iterate.hasNext())
			System.out.println(iterate.next());
	}
}