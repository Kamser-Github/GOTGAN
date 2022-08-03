package day5.collection01;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueue2 {
	
	public static void main (String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);
		pq.offer(1);
		pq.offer(9);
		pq.offer(0);
		pq.offer(4);
		
		System.out.println(pq);
		
		Object obj = null;
		
		while((obj = pq.poll())!=null) {
			System.out.println(obj);
		}
	}
}
