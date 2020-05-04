/* Define a class called Library with the following description:
Instance variables/data members:
Int acc_num         : stores the accession number of books
String title        : stores the title of book
String author       :  stores the name of author
Member methods:
Void input()    : to input and store the accession number, title and 
                  author
Void compute()  : to accept the number of days late, calculate and 
                  display the fine charged t the rate of Rs. 2 per day
Void display()  : to display the details in the following format:
Accession number             Title         Author
Write the main method to create an object of the class and call  the 
above member methods                   
                                              [ICSE 2012]
*/
import java.io.*;
public class Library  
{
int  acc_num;
String title, author;
void input()   throws  IOException
{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Accession Number :");
acc_num= Integer.parseInt(obj.readLine());
System.out.println("Enter the Title :");
title= obj.readLine();
System.out.println("Enter the Author :");
author = obj.readLine();
}
void compute()  throws IOException
{
BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of days late :");
int n= Integer.parseInt(obj.readLine());
int fine=n*2;
System.out.println("Fine :"+fine);
}
void display()  
{
System.out.println("Accession Number\tTitle\t\tAuthor");
System.out.println("\t"+acc_num+"\t\t "+title+"\t\t "+author);
}
public static void main(String args[]) throws IOException
{
Library ob=new Library();
ob.input();
ob. compute();
ob.display();
}
}
