package phaseOneThirdProgram;

import java.io.*;
import java.util.*;

public class StackOperation {

	public static void main(String[] args) {

		// Initialization of Stack
		// using Generics
		Stack<String> stack = new Stack<String>();

		stack.push("First");
		stack.push("Second");
		stack.push("Third");

		// Printing the Stack Elements
		System.out.println(stack);

		// Removing elements using pop() method
		System.out.println("Popped element: " + stack.pop());

		// Printing the Stack Elements
		System.out.println(stack);
	}

}
