package phaseOneThirdProgram;

import java.util.*;

public class LinkedListRemoveFirstOccurence {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);

		//print the linked list before removing
		Iterator<Integer> itr = linkedList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " -> ");
		}
		System.out.println("Null");
		
		//removinf the first occurence in linked list
		linkedList.remove(0);
		
		//print the after removing thr first index
		System.out.print("Linked list after removing the first element : ");
		Iterator<Integer> itr1 = linkedList.iterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " -> ");
		}
		System.out.println("Null");
	}

}
