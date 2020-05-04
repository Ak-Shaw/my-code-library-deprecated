package ExceptionEdureka;

public class SampleException {

	static void avg() {
		
		try {
			
			throw new ArithmeticException("Demo");
		
		}catch(ArithmeticException e) {
			System.out.println("Exception caught");
		}
	}
	
	static void avg2()throws ArithmeticException{
		System.out.println("Inside avg2() method");
		throw new ArithmeticException("Demo");
	}
	
	public static void main(String[] args) {
		
//		String str=null;
//		System.out.println(str.length());
		
		try {
			
			int a=20, b=0;
			int c=a/b;
			
			System.out.println("c="+c);
			
		}catch(ArithmeticException e) {
			System.out.println("can't divide a number by zero");
		}
		
		try {
			
			int num=Integer.parseInt("Edureka");
			System.out.println(num);
		
		}catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
		}
		
		try {
			
			int[] a=new int[5];
			a[7]=9;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bounds");
		}finally {
			System.out.println("finally block executed");
		}
		
		avg();
		
		try {
			avg2();
		}finally {
			System.out.println("caught");
		}
	}
}
