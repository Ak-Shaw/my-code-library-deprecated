package COLLECTION;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		//ArrayList is not synchronized
		//Vector arr=new Vector();
		//Vector is synchronized
		arr.add("Tamonut");//adds string objects
		arr.add("Suphal");
		arr.add("Deborshi");
		arr.add("Sudeep");
		arr.add("Prashant");
		Integer n=new Integer(5);//wrapper class
		arr.add(n);
		//before java 8 we needed to create Integer object
		//to store the object as Integer
		//from java 8 onwards it's automatic
		//eg., arr.add(5)
		arr.add(new Double(15.5));
		arr.add("Deborshi");
		System.out.println(arr);
		
		Iterator itr=arr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator ltr=arr.listIterator();
		
		//the code block below iterates through the objects forward
		while(ltr.hasNext()) {
			
			ltr.next();
		}
		
		
		//the code block below iterates through the objects in reverse
		//while printing the same
		while(ltr.hasPrevious()) {
			
			System.out.println(ltr.previous());
		}
		
		
	}

}
