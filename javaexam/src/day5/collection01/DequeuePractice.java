package day5.collection01;
import java.util.Deque;
import java.util.LinkedList;

public class DequeuePractice {
	
	public static void main(String[] args) {
		
		Deque dq = new LinkedList();
		dq.offer(4);
		dq.offer(2);
		dq.offer(9);
		dq.offer(15);
		
		System.out.println(dq);
		//[4, 2, 9, 15]
		dq.offerFirst(4);
		dq.offerFirst(1);
		dq.offerLast(19);
		dq.offer(4);
		System.out.println(dq);
		
	}
}
