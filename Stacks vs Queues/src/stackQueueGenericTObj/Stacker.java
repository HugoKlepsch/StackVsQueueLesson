/*
		 Title: Stacker.java
		 Programmer: hugo
		 Date of creation: May 4, 2015
		 Description: A class that facilitates the creation and management of a unlimited stack. 
 */

package stackQueueGenericTObj;

import java.util.Vector;

/**
 * @author hugo
 * @note The value inside the angle brackets <> is the class / datatype of the variable you want to hold in the stack. It should be noted that primitive types like int and float are from the Integer and Float class, use the class name, not int. 
 */
public class Stacker<T> { //T is the datatype that will be passed to the class when making this object. 
	private Vector<T> stack; //A Vector is like an array, but can be extended. (It is not a fixed length.) Notice how it is of type "T", the type that is passed when making the object. 

	public Stacker() { //the constructor. It does not need a parameter for length of the array because vector are variable size. 
		stack = new Vector<T>();
	}
	/**
	 * 
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: The variable of type T stored at the top of the stack. 
		 * @Description: returns the item at the top of the stack and does not remove it. "Peeks" the top of the stack. 
	 */
	public T top() { 
		return stack.get(size() - 1); //return the item at the last index. 
	}
	/**
	 * 
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
		 * @Description: ( ͡° ͜ʖ ͡°)
	 */
	public void push(T num) {
		stack.add(num);
	}

	public T pop() {
		return stack.remove(size() - 1);
	}

	public int size() {
		return stack.size();
	}

	public boolean isEmpty() {
		return (size() == 0 ? true : false);
	}

	public void makeEmpty() {
		stack.clear();
	}
}
