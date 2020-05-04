package COLLECTION;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentMap {

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.setSname("Shahid");
		s1.setSdept("CSE");
		
		s2.setSname("Shankasubhra");
		s2.setSdept("ECE");
		
		s3.setSname("Sanju");
		s3.setSdept("CE");
		
		TreeMap<Integer, Student> tm=new TreeMap<Integer, Student>();
		
		tm.put(new Integer(3), s3);
		tm.put(new Integer(2), s2);
		tm.put(new Integer(1), s1);
		
		Set set=tm.entrySet();
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry me=(Map.Entry)itr.next();
			Student stud=(Student)me.getValue();
			System.out.println(me.getKey()+"===>"+stud.getSname()+"===>"+stud.getSdept());
		}
		
		
	}

}
