/*
		 Title: Stacker.java
		 Programmer: hugo
		 Date of creation: May 4, 2015
		 Description: 
*/


package stackAndQueueObj;

import java.util.Vector;

/**
 * @author hugo
 *
 */
public class Stacker{
	private int currentInd;
	private Vector<Integer> stack;
	
	public Stacker() {
		stack = new Vector<Integer>();
		currentInd = 0;
	}
	
	public int top(){
		return (int) stack.get(currentInd);
	}
	
	public void push(int num){
		stack.add(++currentInd, num);
	}
	
	public int pop(){
//		return stack[currentInd--];
		return (int) stack.get(currentInd--);
	}
	
	public int size(){
		return currentInd;
	}
	
	public boolean isEmpty(){
		return (size() == 0 ? true : false);
	}
	
	public void makeEmpty(){
		currentInd = 0;
	}
}
