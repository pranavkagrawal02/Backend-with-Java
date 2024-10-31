package sets;
import java.util.EnumSet;


public class EnumSetExample {
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE
	}
	
	
	public static void main(String[] args) {
		public static void main(String[] args) {
			EnumSet<Size> sizes EnumSet.allOf(Size.class); System.out.println(sizes);
			EnumSet<Size> sizes1 EnumSet.noneof(Size.class); System.out.println(sizes1);
			
			EnumSet<Size> sizes2 EnumSet.range(Size.MEDIUM, Size.EXTRALARGE); System.out.println(sizes2);
			EnumSet<Size> sizes3 EnumSet.of(Size.SMALL, Size.LARGE); System.out.println(sizes3);
			Iterator<Size> iterator sizes.iterator(); 
			while(iterator.hasNext()) { 
				System.out.println(iterator.next()); }
			System.out.println(sizes.remove(Size.MEDIUM)); 
			System.out.println(sizes.removeAll(sizes));
	}
}