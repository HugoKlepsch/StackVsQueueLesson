/*
		 Title: Stacker.java
		 Programmer: hugo
		 Date of creation: May 4, 2015
		 Description: 
*/


package stackAndQueueObj;

/**
 * @author hugo
 *
 */
public class Stacker {
	private int currentInd;
	private int[] stack;
	
	public Stacker(int length) {
		stack = new int[length];
		currentInd = 0;
	}
	
	public int top(){
		return stack[currentInd];
	}
	
	public void push(int num){
		stack[++currentInd] = num;
	}
	
	public int pop(){
		return stack[currentInd--];
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
