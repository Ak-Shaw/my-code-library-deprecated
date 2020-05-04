package COLLECTION;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		//Set doesn't allow duplicate values
		
		//HashSet hs=new HashSet();
		//HashSet gives no particular order
		//LinkedHashSet hs=new LinkedHashSet();
		//LinkedHashSet gives inserted order
		TreeSet hs=new TreeSet();
		//TreeSet gives ascending order
		hs.add("Tamonut");
		hs.add("Deborshi");
		hs.add("Suphal");
		hs.add("Deborshi");
		hs.add("Ayush");
		
		Iterator itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
