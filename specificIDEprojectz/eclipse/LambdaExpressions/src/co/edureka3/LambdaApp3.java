package co.edureka3;

@FunctionalInterface
interface Cab{
	double bookCab(String source, String destination);
}

public class LambdaApp3 {

	public static void main(String[] args) {

		Cab cab=(source, destination)->{
			System.out.println("UberX Booked from "+source+" to "+destination+"!! Arriving Soon!!");
			return 850.12;
		};
		
		double fare=cab.bookCab("Mumbai", "Delhi");
		System.out.println("Fare shall be : "+fare);
	}

}
