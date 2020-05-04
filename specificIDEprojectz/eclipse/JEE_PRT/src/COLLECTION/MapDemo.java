package COLLECTION;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		
		//since HashMap is not a collection we can't use add() method or even iterator
		
		//HashMap hp=new HashMap();
		
		//LinkedHashMap hp=new LinkedHashMap();
		
		TreeMap hp=new TreeMap();
		
		hp.put("TV", new Double(30000.00));
		hp.put("Smart Phone", new Double(10000.00));
		hp.put("Headphones", new Double(5000.00));
		hp.put("Radio", new Double(1000.00));
		hp.put("TV", new Double(40000.00));
		
		Set set=hp.entrySet();
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println(me.getKey()+"===>"+me.getValue());
		}
	}

}
