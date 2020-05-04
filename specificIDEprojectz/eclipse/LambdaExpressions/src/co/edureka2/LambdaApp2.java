package co.edureka2;

@FunctionalInterface
interface Cab{
	void bookCab(String source, String destination);
}

public class LambdaApp2 {

	public static void main(String[] args) {

		Cab cab=(source, destination)->{
			System.out.println("UberX Booked from "+source+" to "+destination+"!! Arriving Soon!!");
		};
		
		cab.bookCab("Mumbai", "Delhi");
	}

}
