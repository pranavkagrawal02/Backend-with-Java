package queues;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingQueueExample {
	public static void reverse (Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>(); 
		while(!queue.isEmpty()) 
			stack.push(queue.remove()); 
		while(!stack.isEmpty()) 
			queue.add(stack.pop()); 
	}	
	
	public static void main(String[] args) {
	
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		
		System.out.println("Original Queue: " + queue);
		reverse(queue);
		System.out.println("Reversed Queue" queue);
		
	}
}