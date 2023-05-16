package phaseOneThirdProgram;

import java.util.*;

public class QueueOperation {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();

		// add elements to the queue
		queue.add("First");
		queue.add("Second");
		queue.add("Third");

		// print the queue
		System.out.println("Queue: " + queue);
		
        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);
 
        // print the updated queue
        System.out.println("Queue after removal: " + queue);
	}

}
