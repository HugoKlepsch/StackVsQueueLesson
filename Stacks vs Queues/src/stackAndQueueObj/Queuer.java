/*
		 Title: Queuer.java
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
public class Queuer {
	Vector<Integer> queue;
	
	
	
	public Queuer() {
		queue = new Vector<Integer>();
	}
	
	public int front(){
		return queue.get(size() - 1);
	}
	
	public int size(){
		return queue.size();
	}
	
	public int deQueue(){
		return queue.remove(size() - 1);
	}
	
	public void enQueue(int number){
		queue.add(number);
	}
	
	public boolean isEmpty(){
		return (queue.size()) > 0 ? false : true; 
	}
	
	public void makeEmtpy(){
		queue.clear();
	}
	
}
