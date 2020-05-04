package co.edureka;

@FunctionalInterface
interface Cab{//when an interface will have exactly 1 abstract method we can say it as a Functional interface
	void bookCab();//->by default public abstract void bookCab();
}

//class UberX implements Cab{
//	public void bookCab() {
//		System.out.println("UberX Booked!! Arriving Soon!!");
//	}
//}

public class LambdaApp {

	public static void main(String[] args) {

//	  	//1.
//		Cab cab=new UberX();//Polymorphic Statement
//		cab.bookCab();
		
//	  	//2.
//		//Anonymous Class Implementation
//		Cab cab=new Cab() {
//			
//			@Override
//			public void bookCab() {
//				System.out.println("UberX Booked!! Arriving Soon!!");
//			}
//		};
//		
//		cab.bookCab();
		
		//3.
		//Using a Lambda Expression
		Cab cab=()->{
			System.out.println("UberX Booked!! Arriving Soon!!");
		};
		
		cab.bookCab();
	}

}
