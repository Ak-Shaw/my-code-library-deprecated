package co.edureka4;

@FunctionalInterface
interface Cab{
	double bookCab(String source, String destination);
}

public class LambdaApp4 {

	int instanceVar=10;
	static int sVar=100;
	
	public static void main(String[] args) {

		Cab cab=(source, destination)->{
			int localVar=1000;
			System.out.println("UberX Booked from "+source+" to "+destination+"!! Arriving Soon!!");
			System.out.println("localVar is : "+localVar);
			//System.out.println("instanceVar is : "+instanceVar);
			System.out.println("Static Variable is : "+LambdaApp4.sVar);
			return 850.12;
		};
		
		double fare=cab.bookCab("Mumbai", "Delhi");
		System.out.println("Fare shall be : "+fare);
	}

}
