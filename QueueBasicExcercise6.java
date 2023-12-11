package Queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasicExcercise6 {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(List.of("Apple", "Banana", "Cat"));
		System.out.println(queue);
		queue.offer("Dog");
		queue.offer("Elephant");
		System.out.println(queue);
		queue.addAll(List.of("APPLE", "BANANA"));
		System.out.println(queue);

	}

}
