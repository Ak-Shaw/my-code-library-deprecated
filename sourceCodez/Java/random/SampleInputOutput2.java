//Sample Input and Output Cheat Sheet

//demonstration of sample input and output of primitive and non-primitive data types in Java
//using PrintWriter object

import java.io.*;
import java.util.*;

public class SampleInputOutput2
{
    public static void main(String[] args)throws IOException
    {
    	PrintWriter p=new PrintWriter(System.out,true);
        Scanner s=new Scanner(System.in);
        p.printf("enter a short value:");
        short v1=s.nextShort();
        p.printf("enter a byte value:");
        byte v2=s.nextByte();
        p.printf("enter an integer value:");
        int v3=s.nextInt();
        p.printf("enter a long value:");
        long v4=s.nextLong();
        p.printf("enter a float value:");
        float v5=s.nextFloat();
        p.printf("enter a double value:");
        double v6=s.nextDouble();
        p.printf("enter a character:");
        char v7=(s.next()).charAt(0);
        p.printf("enter a boolean value:");
        boolean v8=s.nextBoolean();
        p.printf("enter a String(with no spaces):");
        String v9=s.next();
        p.printf("enter a String(containing white spaces):");
        s.nextLine();
        String v10=s.nextLine();

		p.println("\fentered valuez are :\n\n");
		p.println("short :"+v1);
		p.println("byte :"+v2);
		p.println("int :"+v3);
		p.println("long :"+v4);
		p.println("float :"+v5);
		p.println("double :"+v6);
		p.println("character :"+v7);
		p.println("boolean :"+v8);
		p.println("String(with no spaces) :"+v9);
		p.println("String(containing white spaces) :"+v10);
	}
}