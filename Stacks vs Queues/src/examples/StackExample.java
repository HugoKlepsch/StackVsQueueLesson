/*
		 Title: StackExample.java
		 Programmer: hugo
		 Date of creation: May 4, 2015
		 Description: 
 */

package examples;

import java.util.Stack;

import stackQueueGenericTObj.Queuer;
import stackQueueGenericTObj.Stacker;

/**
 * @author hugo
 *
 */
public class StackExample {

	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	public static void main(String[] args) {
		myStack();
		javaUtilStack();
		myQueue();
		System.out.println("javaUtilQueue: \n");
	}

	private static void myQueue() {
		System.out.println("myQueue: \n");
		Queuer<Integer> q = new Queuer<Integer>();
		System.out.println("Adding two items to queue.");
		q.enQueue(33);
		q.enQueue(47);
		System.out.println("The front of queue: " + q.front());
		System.out.println("Number of items in queue: " + q.size());
		System.out.println("Dequeueing or removing the front item.");
		q.deQueue();
		System.out.println("Front of queue is now: " + q.front());
		System.out.println("Number of items in queue now: " + q.size());
		System.out.println("Queueing or adding a new item.");
		q.enQueue(3);
		System.out.println("Front of queue is now: " + q.front());
		System.out.println("Number of items in queue now: " + q.size());
		System.out.println("\n");
	}

	private static void myStack() {
		System.out.println("myStack: \n");
		Stacker<Integer> sampleStack = new Stacker<Integer>();

		sampleStack.push(5);
		sampleStack.push(8);
		
		int elementX = sampleStack.pop();
		sampleStack.push(elementX);
		sampleStack.push(12);
		sampleStack.push(13);
		int elementY = sampleStack.pop();
		System.out.println(elementX + " " + elementY);
		elementY = sampleStack.pop();
		elementX = sampleStack.top();
		System.out.println(elementX + " " + elementY);
		System.out.println("\n");
	}

	private static void javaUtilStack() {
		System.out.println("javaUtilStack: \n");
		Stack<Integer> sampleStack = new Stack<Integer>();

		sampleStack.push(5);
		sampleStack.push(8);
		int elementX = sampleStack.pop();
		sampleStack.push(elementX);
		sampleStack.push(12);
		sampleStack.push(13);
		int elementY = sampleStack.pop();
		System.out.println(elementX + " " + elementY);
		elementY = sampleStack.pop();
		elementX = sampleStack.peek();
		System.out.println(elementX + " " + elementY);
		System.out.println("\n");
	}

}
