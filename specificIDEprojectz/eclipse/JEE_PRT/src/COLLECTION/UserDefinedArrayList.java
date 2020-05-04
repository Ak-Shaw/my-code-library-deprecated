package COLLECTION;

import java.util.*;

public class UserDefinedArrayList {

	public static void main(String[] args) {

		Product pd1=new Product();
		Product pd2=new Product();
		
		pd1.setPname("TV");
		pd1.setPrice(30000.00);
		
		pd2.setPname("Refrigerator");
		pd2.setPrice(20000.00);
		
		ArrayList<Product> arr=new ArrayList<Product>();
		
		arr.add(pd1);
		arr.add(pd2);
		
		Iterator<Product> itr=arr.iterator();
		
		while(itr.hasNext()) {
			
			Product pdt=(Product)itr.next();
			
			System.out.println(pdt.getPname()+"===>"+pdt.getPrice());
		}
	}

}
