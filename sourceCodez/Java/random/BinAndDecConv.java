// binary to decimal and decimal to binary using switch case

import java.util.*;

public class BinAndDecConv{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("press 1 for binary to decimal conversion\n"+
							"press 2 for decimal to binary conversion\n\n"+
							"choice : ");

		int c=sc.nextInt();

		switch(c){

			case 1:

				System.out.print("enter a binary value : ");
				long b=sc.nextLong();

				int p=0, dig, d=0;
				while(b>0){

					dig=(int)(b%10);

					d+=dig*(int)Math.pow(2,p++);

					b/=10;

				}

				System.out.println("\ndecimal equivalent : "+d);

				break;

			case 2:

				System.out.print("enter a decimal value : ");
				int dec=sc.nextInt();

				String bin="";

				while(dec>0){

					bin=Integer.toString(dec%2)+bin;

					dec/=2;
				}

				System.out.println("\nbinary equivalent : "+bin);

				break;

			default:
				
				System.out.println("wrong choice!!");
		}
	}
}