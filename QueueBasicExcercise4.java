package Queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasicExcercise4 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(List.of("Apple", "Banana", "Cat", "Dog", "Elephant"));
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);

	}

}
