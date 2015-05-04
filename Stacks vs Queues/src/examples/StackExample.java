/*
		 Title: StackExample.java
		 Programmer: hugo
		 Date of creation: May 4, 2015
		 Description: 
 */

package examples;

import stackAndQueueObj.Stacker;

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
		Stacker sampleStack = new Stacker(10);
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
	}

}
