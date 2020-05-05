import java.util.*;

public class Swapping3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("a = ");
		int a = sc.nextInt();

		System.out.print("b = ");
		int b = sc.nextInt();

		int[] arr = new int[2];

		arr[0] = a;
		arr[1] = b;

		//swapping
		swapArr(arr);

		a = arr[0];
		b = arr[1];

		System.out.println("\nAfter swapping: \n");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void swapArr(int[] arr) {

		int t = arr[0];
		arr[0] = arr[1];
		arr[1] = t;
	}
}