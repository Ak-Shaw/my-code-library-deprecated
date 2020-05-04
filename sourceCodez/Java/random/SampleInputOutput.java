import java.util.*;

public class SampleInputOutput
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		byte a; 
		short b;
		int c;
		long d;
		float e;
		double f;
		boolean g;
		char h;
		String i,j;

		System.out.print("enter a byte value : ");
		a=sc.nextByte();
		System.out.print("enter a short value : ");
		b=sc.nextShort();
		System.out.print("enter a int value : ");
		c=sc.nextInt();
		System.out.print("enter a long value : ");
		d=sc.nextLong();
		System.out.print("enter a float value : ");
		e=sc.nextFloat();
		System.out.print("enter a double value : ");
		f=sc.nextDouble();
		System.out.print("enter a boolean value : ");
		g=sc.nextBoolean();
		System.out.print("enter a character value : ");
		h=(sc.next()).charAt(0);
		System.out.print("enter a String value(word) : ");
		i=sc.next();
		sc.nextLine();
		System.out.print("enter a String value(line) : ");
		j=sc.nextLine();
		
		System.out.println("\n\n\nthe entered values are : \n\n");
		System.out.println("Byte value : "+a);
		System.out.println("Short value : "+b);
		System.out.println("Integer value : "+c);
		System.out.println("Long value : "+d);
		System.out.println("FLoat value : "+e);
		System.out.println("Double value : "+f);
		System.out.println("Boolean value : "+g);
		System.out.println("Character value : "+h);
		System.out.println("String value 1 : "+i);
		System.out.println("String value 2 : "+j);
	}
}