import java.util.*;

public class SwitchOptions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print(	"Press 1 for One\n"+
							"Press 2 for Two\n"+
							"Press 3 for Three\n"+
							"\nChoice : ");

		int c = sc.nextInt();

		switch (c) {

			case 1: System.out.println("One"); break;
			case 2: System.out.println("Two"); break;
			case 3: System.out.println("Three"); break;

			default: System.out.println("Invalid Option!");
			
		}
	}
}