package kr.co.collection;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class StackAndQueue {
	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0"); q.offer("0");
		st.push("1"); q.offer("1");
		st.push("2"); q.offer("2");
		st.push("3"); q.offer("3");
		st.push("4"); q.offer("4");
		
		System.out.println("= Stack =");
		while(!st.isEmpty()) {
			if(st.peek()!=null)
				System.out.print(st.peek()+" ");
			System.out.print(st.pop());
			System.out.println();
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			if(q.peek()!=null)
				System.out.print(q.peek()+" ");
			System.out.print(q.poll());
			System.out.println();
		}
		
		
	}
}
