import java.util.*;

public class Swapping2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("a = ");
		int a = sc.nextInt();

		System.out.print("b = ");
		int b = sc.nextInt();

		Pair myPair = new Pair(a, b);

		//swapping
		swapPair(myPair);

		//getting values after swap
		a = myPair.a;
		b = myPair.b;

		System.out.println("\nAfter swapping: \n");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void swapPair(Pair myPair) {

		int t = myPair.a;

		myPair.a = myPair.b;

		myPair.b = t;
	}

	
}

class Pair {

	int a;
	int b;

	Pair(int a, int b) {

		this.a = a;
		this.b = b;
	}
}