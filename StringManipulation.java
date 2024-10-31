package arrays;
public class StringManipulation Example {
	public static void main(String[] args) {
		
		// Using String Literal 
		String str1 = "Hello "; System.out.println(str1);
		
		// Using String Object
		String str2 = new String("World"); System.out.println(str2);
		
		// Concatenating String Literal and String Object
		String str3 = str1 + str2; System.out.println(str3);
		

		// String Method
		System.out.println(str3.length());
		System.out.println(str3.charAt(0));
		System.out.println(str1.concat(str2));
		System.out.println(str3.substring(0,5));
		System.out.println(str1.equals(str2));
		System.out.println(str3.contains("Hello"));
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str3.trim());
	}
}

/*
	Method					Description
String Split()-Splits the string at the specified string (regex)
String CompareTo()-Compares two strings in the dictionary order
String length()-Returns the length of the string
String replace()-Replace all matching characters/text in the string
String contains()-Checks whether the string contains a substring
String trim()-Removes any leading and trailing whitespace
String concat()-Concatenates two strings and returns it
String indexOf()-Returns the index of the character/substring
*/