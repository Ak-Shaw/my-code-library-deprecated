/*
 You have given 2 arrays, and intrigued to find if they are Disjoint!.

//Ar1   [1,2,3,4]
//Ar2   [21,30,84]

They are Disjoint, cause the sets of numbers are different among them
it will be set of arrays of array more specifically.

Now you are instructed to find the similar arrays from the arrays of array

//ar1 [[2,3],[55,77],[78,01],[-2,-5.2]]

//ar2. [[2,77,3],[55,902,77],[786,01],[-2,-51.2],[55,77],[2,3]]

The output will be

[55,77] [2,3]

*/

import java.util.*;

 class Symmetric_sets
 {
 	public static void main(String args[])
 	{
 		Scanner sc=new Scanner(System.in);
 		
 		int i, j, k;
 		double t;
 		
 		//accepting the no. of sets in each set of 
 		//sets as well as max no of elements the sets can hold
 		System.out.print("enter the quantity of first set of sets :");
 		int r1=sc.nextInt();
 		System.out.print("enter the max no. of elements in each set :");
 		int c1=sc.nextInt();
 		
 		System.out.print("\nenter the quantity of second set of sets :");
 		int r2=sc.nextInt();
 		System.out.print("enter the max no. of elements in each set :");
 		int c2=sc.nextInt();
 		
 		double s1[][]=new double[r1][c1];
 		double s2[][]=new double[r2][c2];
 		
 		double a[][]=new double[r1][c1];
 		double b[][]=new double[r2][c2];
 		
 		int se1[]=new int[r1];
 		int se2[]=new int[r2];
 		
 		//accepting elements
 		//note:the no. of elements should not the max element limit
 		System.out.println("\n\nelements for first set of sets :\n");
 		for(i=0;i<r1;i++)
 		{
 			System.out.print("no. of elemets for set "+(i+1)+":");
 			se1[i]=sc.nextInt();

 			System.out.println("enter elements:");
 			for(j=0;j<se1[i];j++)
 			{
 				s1[i][j]=sc.nextDouble();
 				a[i][j]=s1[i][j];//copying each each elment so as to create identical array
 			}
 		}
 		
 		//accepting elements
 		//note:the no. of elements should not the max element limit
 		System.out.println("\n\nelements for second set of sets :\n");
 		for(i=0;i<r2;i++)
 		{
 			System.out.print("no. of elemets for set "+(i+1)+":");
 			se2[i]=sc.nextInt();

 			System.out.println("enter elements:");
 			for(j=0;j<se2[i];j++)
 			{
 				s2[i][j]=sc.nextDouble();
 				b[i][j]=s2[i][j];//copying each each elment so as to create identical array
 			}
 		}
 		
 		//applying bubble sort in all the sets of duplicate of first set of sets
 		for(i=0;i<r1;i++)
 		{
 			for(k=0;k<se1[i]-1;k++)
 				for(j=0;j<se1[i]-1-k;j++)
 					if(a[i][j]>a[i][j+1])
 					{
 						t=a[i][j];
 						a[i][j]=a[i][j+1];
 						a[i][j+1]=t;
 					}
 		}
 		
 		//applying bubble sort in all the sets of duplicate of second set of sets
 		for(i=0;i<r2;i++)
 		{
 			for(k=0;k<se2[i]-1;k++)
 				for(j=0;j<se2[i]-1-k;j++)
 					if(b[i][j]>b[i][j+1])
 					{
 						t=b[i][j];
 						b[i][j]=b[i][j+1];
 						b[i][j+1]=t;
 					}
 		}
 		
 		//	creating an array to store our result in binary format
 		//	1 denotes symmetric set and 0 the other
 		//	note:	the size of this array is taken r1 because
 		//			we are comparying each set of first list with
 		//			all of the sets of the second list
 		int r[]=new int[r1];
 		
 		//implementing the above mentioned MO
 		for(i=0;i<r1;i++)
 		{
 			for(j=0;j<r2;j++)
 			{
 				if(se1[i]==se2[j])
 				{
 					int c=0;
 					for(k=0;k<se1[i];k++)
 						if(a[i][k]==b[j][k])
 							c++;
 							
 					if(c==se1[i])
 						r[i]=1;
 				}
 			}
 		}

 		/*

 		all the statements below are just used for presentation purpose.

 		*/
 		
 		System.out.print("\n\nfirst set of sets :\n[");
 		for(i=0;i<r1;i++)
 		{
 			double f=s1[i][0];
			if(f==(int)f)
				System.out.print("["+(int)f);
			else
				System.out.print("["+f);

			for(j=1;j<se1[i];j++)
 				{
 					f=s1[i][j];
	 				if(f==(int)f)
	 					System.out.print(","+(int)f);
	 				else
	 					System.out.print(","+f);
 				}
 				System.out.print("]");
 				if(i!=r1-1)
 					System.out.print(",");
 		}
 		System.out.println("]");

 		System.out.print("\n\nsecond set of sets :\n[");
 		for(i=0;i<r2;i++)
 		{
 			double f=s2[i][0];
			if(f==(int)f)
				System.out.print("["+(int)f);
			else
				System.out.print("["+f);

			for(j=1;j<se2[i];j++)
 				{
 					f=s2[i][j];
	 				if(f==(int)f)
	 					System.out.print(","+(int)f);
	 				else
	 					System.out.print(","+f);
 				}
 				System.out.print("]");
 				if(i!=r2-1)
 					System.out.print(",");
 		}
 		System.out.println("]");

 		int c=0;
 		System.out.println("\n\nSymmetric sets are as follows :\n");
 		for(i=0;i<r1;i++)
 			if(r[i]==1)
 			{
 				double f=s1[i][0];
 				if(f==(int)f)
 					System.out.print("["+(int)f);
 				else
 					System.out.print("["+f);

 				for(j=1;j<se1[i];j++)
 				{
 					f=s1[i][j];
	 				if(f==(int)f)
	 					System.out.print(","+(int)f);
	 				else
	 					System.out.print(","+f);
 				}
 				System.out.println("]");
 				c++;
 			}

 		if(c==0)
 			System.out.println("no Symmetric sets found");
 	}
 }