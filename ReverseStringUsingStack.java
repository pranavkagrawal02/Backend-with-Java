package stacks;
import java.util.Stack;
class StringReverser {
	public String reverse (String input) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch input.toCharArray())
			stack.push(ch);
		String reversed = "";
		
		while(!stack.empty())
			reversed += stack.pop();
		
		return reversed;
	}
}

public class ReverseStringUsingStackExample {
	public static void main(String[] args) {
		String str = "abcd";
		StringReverser reverser = new StringReverser();
		String result = reverser.reverse(str);
		System.out.println("Original String: + str);
		System.out.println("Reversed String : + result);
	}
}