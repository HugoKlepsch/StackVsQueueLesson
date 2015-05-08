/*
		 Title: genericArray.java
		 Programmer: hugo
		 Date of creation: May 7, 2015
		 Description: Two classes that show the differences between a regular class and one that uses generics. myCoolArray is the regular class, & genericArray uses generic types. 
*/


package stackQueueGenericTObj;

import java.util.Vector;

/**
 * @author hugo
 * @note This class uses generics. The T inside the angle brackets <> is the type that is passed in the constructor. 
 */
class genericArray <T> {  // T is the datatype that will be passed to the class when making this object.
	Vector<T> dataThings; // A Vector is like an array, but can be extended. (It is not a fixed length.) Notice how
							// it is of type "T", the type that is passed when making the object.
	
    public genericArray(){
        dataThings = new Vector<T>(); //initialises the vector array with the passed datatype. 
    }
    
    public T getFirstElement(){ //note that the return type is the type that is passed. 
        return dataThings.get(0);
    }
    
    //etc. more functions to get/set indexes in the array
}

class myCoolArray { //performs the same actions as genericArray, but can accept only one type. In this case, integers
    int[] dataThings; //notice the datatype is "set in stone"
    
    public myCoolArray(int length){
        dataThings = new int[length];
    }
    
    public int getFirstElement(){ //the datatypes are all preset, and can't be set
        return dataThings[0];
    }
    //etc. more functions to get/set indexes in the array
}
