import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		ArrayList<Integer> primesList1 = getPrimesWithinLimits(n1, n2);

		ArrayList<Integer> primesList2 = getPrimesOfSecondList(primesList1);

		Collections.sort(primesList2);

		int smallest = primesList2.get(0);

		int largest = primesList2.get(primesList2.size() - 1);

		int listCount = primesList2.size();

		System.out.println(specialFiboTerm(smallest, largest, listCount));
	}

	public static long specialFiboTerm(long a, long b, int n) {

		long fibo = 0;

		for (int i = 3; i <= n; i++) {

			fibo = a + b;

			a = b;

			b = fibo;
		}

		return fibo;
	}

	public static ArrayList<Integer> getPrimesOfSecondList(ArrayList<Integer> primesList) {

		ArrayList<Integer> primesList2 = new ArrayList<Integer>();

		for (int i = 0; i < primesList.size(); i++) {
			for (int j = 0; j < primesList.size(); j++) {

				if (i == j) {
					continue;
				}

				int n = getCombo(primesList.get(i), primesList.get(j));

				if (isPrime(n)) {
					primesList2.add(n);
				}
			}
		}

		return primesList2;
	}

	public static int getCombo(int a, int b) {

		String numA = Integer.toString(a);
		String numB = Integer.toString(b);

		return Integer.parseInt(numA + numB);
	}

	public static ArrayList<Integer> getPrimesWithinLimits(int n1, int n2) {

		ArrayList<Integer> primesList = new ArrayList<>();

		for (int i = n1; i <= n2; i++) {

			if (isPrime(i)) {
				primesList.add(i);
			}
		}

		return primesList;
	}

	static boolean isPrime(int n) 
    { 
        if (n <= 1) {
        	return false; 
        }

        if (n <= 3) {
        	return true; 
        }
      
        if (n % 2 == 0 || n % 3 == 0) {
        	return false; 
        }
      
        for (int i = 5; i * i <= n; i = i + 6) {

            if (n % i == 0 || n % (i + 2) == 0) {
            	return false; 
            }
        }
      
        return true; 
    } 
}