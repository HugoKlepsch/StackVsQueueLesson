/*
		 Title: genericArray.java
		 Programmer: hugo
		 Date of creation: May 7, 2015
		 Description: 
*/


package stackQueueGenericTObj;

import java.util.Vector;

/**
 * @author hugo
 *
 */
class genericArray <T> {
	Vector<T> dataThings;
    public genericArray(){
        dataThings = new Vector<T>();
    }
    public T getFirstElement(){
        return dataThings.get(0);
    }
    //etc. more functions to get/set indexes in the array
}

class myCoolArray {
    int[] dataThings;
    public myCoolArray(int length){
        dataThings = new int[length];
    }
    public int getFirstElement(){
        return dataThings[0];
    }
    //etc. more functions to get/set indexes in the array
}
