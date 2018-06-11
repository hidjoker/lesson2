package collection;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionEx_13_Queue {
	public static void main(String[] args) {

		Queue queue = new LinkedList();
		
		System.out.println("---offer()-----");
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		System.out.println(queue);
		System.out.println("农扁 : "+queue.size());
		
		System.out.println("---poll()-----");
		System.out.println( queue.poll() );
		System.out.println(queue);
		System.out.println("农扁 : "+queue.size());

		System.out.println( queue.poll() );
		System.out.println(queue);
		System.out.println("农扁 : "+queue.size());
	
		System.out.println("---peek()-----");
		System.out.println( queue.peek() );
		System.out.println(queue);
		System.out.println("农扁 : "+queue.size());
		
		
	}
}














