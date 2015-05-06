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
public class Stacker<T>{
	private Vector<T> stack;
	
	public Stacker() {
		stack = new Vector<T>();
	}
	
	public T top(){
		return stack.get(size() - 1);
	}
	
	public void push(T num){
		stack.add(num);
	}
	
	public T pop(){
		return stack.remove(size() - 1);
	}
	
	public int size(){
		return stack.size();
	}
	
	public boolean isEmpty(){
		return (size() == 0 ? true : false);
	}
	
	public void makeEmpty(){
		stack.clear();
	}
}
