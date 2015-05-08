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
public class Stacker<T> { // T is the datatype that will be passed to the class when making this object.
	private Vector<T> stack; // A Vector is like an array, but can be extended. (It is not a fixed length.) Notice how
								// it is of type "T", the type that is passed when making the object.

	public Stacker() { // the constructor. It does not need a parameter for length of the array because vector are
						// variable size.
		stack = new Vector<T>();
	}

	/**
	 * 
		 * @author hugo
		 * Date of creation: May 4, 2015
		 * @param: None
		 * @return: The variable of type T stored at the top of the stack. 
		 * @Description: returns the item at the top of the stack and does not remove it. "Peeks" the top of the stack. 
	 */
	public T top() {
		return stack.get(size() - 1); // return the item at the last index.
	}

	/**
	 * 
		 * @author hugo
		 * Date of creation: May 4, 2015
		 * @param: The variable to push to the top of the stack, of the type mentioned before in the constructor
		 * @return: None
		 * @Description: takes in a variable, and places it on the top of the stack. 
	 */
	public void push(T num) {
		stack.add(num); // the add function increases the size of the vector array
	}

	/**
	 * 
		 * @author hugo
		 * Date of creation: May 4, 2015
		 * @param: None
		 * @return: The variable of type T stored at the top of the stack. Note it is of the type mentioned in the constructor. 
		 * @Description: Removes and returns the top item in the stack, reduces the size of the vector array by one.  
	 */
	public T pop() {
		return stack.remove(size() - 1); // the remove function reduces the size of the vector array by one.
	}

	/**
	 * 
		 * @author hugo
		 * Date of creation: May 4, 2015
		 * @param: None
		 * @return: The size of the vector array. 
		 * @Description: gets the size of the vector array. 
	 */
	public int size() { // note that it does not used the passed type, because the length of an array is not affected by
						// the types it holds.
		return stack.size();
	}

	/**
	 * 
		 * @author hugo
		 * Date of creation: May 4, 2015
		 * @param: None
		 * @return: true if the array is empty, or false if the array has one or more items. 
		 * @Description: Gets the size of the vector array, then determines if it is empty
	 */
	public boolean isEmpty() {
		return (size() == 0 ? true : false);
	}

	/**
	 * 
		 * @author hugo
		 * Date of creation: May 4, 2015 
		 * @param: None
		 * @return: None
		 * @Description: Changes the size of the vector array to zero
	 */
	public void makeEmpty() {
		stack.clear();
	}
}




