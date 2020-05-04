import java.util.*;

public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("a = ");
		int a = sc.nextInt();

		System.out.print("b = ");
		int b = sc.nextInt();

		//swapping
		int t = a;
		a = b;
		b = t;

		System.out.println("\nAfter swapping: \n");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}