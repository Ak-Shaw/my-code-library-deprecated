import java.io.*;
import java.util.*;

public class Solution {

	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    	int t = sc.nextInt();

    	String[] result = new String[t];

    	for (int i = 0; i < t; i++) {

    		result[i] = getResultOfTestCase();
    	}

    	for (int i = 0; i < t; i++) {

    		System.out.println(result[i]);
    	}
    }

    public static String getResultOfTestCase() {

    	int n = sc.nextInt();

    	HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

    	for (int i = 0; i < n; i++) {

    		String name = sc.next();
    		int amount = sc.nextInt();

    		if (map.containsKey(name)) {
    			map.get(name).add(amount);
    		
    		} else {

    			ArrayList<Integer> amounts = new ArrayList<Integer>();
    			amounts.add(amount);

    			map.put(name, amounts);
    		}
    	}

    	String resultName = "";
    	long resultAmount = -1l;

    	for (String name : map.keySet()) {

    		long amountDue = getMaxThree(map.get(name));

    		if (amountDue > resultAmount) {

    			resultAmount = amountDue;
    			resultName = name;
    		
    		} else if (amountDue == resultAmount) {

    			if (name.compareTo(resultName) < 0) {
    				resultName = name;
    			}
    		}
    	}

    	return resultName + " " + resultAmount;
    }

    public static long getMaxThree(ArrayList<Integer> amountList) {

    	Collections.sort(amountList, Collections.reverseOrder());

    	long max = amountList.get(0);

    	if (amountList.size() > 1)
    		max += amountList.get(1);

    	if (amountList.size() > 2) 
    		max += amountList.get(2);

    	return max;
    }
}