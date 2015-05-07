/*
		 Title: Queuer.java
		 Programmer: hugo
		 Date of creation: May 4, 2015
		 Description: 
*/


package stackQueueGenericTObj;

import java.util.Vector;

/**
 * @author hugo
 *
 */
public class Queuer <T>{
	private Vector<T> queue;
	
	
	
	public Queuer() {
		queue = new Vector<T>();
	}
	
	public T front(){
		return queue.get(size() - 1);
	}
	
	public int size(){
		return queue.size();
	}
	
	public T deQueue(){
		return queue.remove(size() - 1);
	}
	
	public void enQueue(T number){
		queue.insertElementAt(number, 0);
	}
	
	public boolean isEmpty(){
		return (queue.size()) > 0 ? false : true; 
	}
	
	public void makeEmtpy(){
		queue.clear();
	}
	
}
