import java.util.*;

public class ListIteratorEditExample {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		ListIterator<Integer> itr = list.listIterator();

		int i = 0;

		int j = -1;

		// getting element at 4th index
		while (itr.hasNext() && i <= 4) {
			j = itr.next();
			i++;
		}

		System.out.println(j);

		// editing element at 4th index
		itr.remove();
		itr.add(100);

		System.out.println(list);
	}
}