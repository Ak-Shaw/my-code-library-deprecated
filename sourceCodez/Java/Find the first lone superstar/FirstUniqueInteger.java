import java.util.*;
class FirstUniqueInteger{
	
	static class Pair {

		int freq;

		int index;
	}

	public static int firstUniqueInteger(Vector<Integer> vec)
	{
		HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();

		for (int i = 0; i < vec.size(); i++) {

			if (map.containsKey(vec.get(i))) {

				Pair p = map.get(vec.get(i));

				p.freq += 1;

				map.put(vec.get(i), p);
			}

			else {

				Pair p = new Pair();

				p.index = i;

				p.freq = 1;

				map.put(vec.get(i), p);
			}

		}

		int min_index = Integer.MAX_VALUE;

		int first_unique = -1;

		for (int key : map.keySet()) {

			if (map.get(key).freq == 1 && map.get(key).index < min_index) {

				min_index = map.get(key).index;

				first_unique = key;
			}
		}

		return first_unique;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Vector<Integer> vec=new Vector<Integer>();
		for(int i=0;i<n;i++)
			vec.add(sc.nextInt());
		System.out.println(firstUniqueInteger(vec));
	}
}
