// Swap two variables without using third variable 
// Indirect Method I
import java.io.*;
public class Swap_1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter 1st number :");
int a=Integer.parseInt(br.readLine());
System.out.print("Enter 2nd number :");
int b=Integer.parseInt(br.readLine());
System.out.println("--------------------------");
System.out.println("Variables before swapping :");
System.out.println(a);
System.out.println(b);
int c=a+b;
a=c-a;
b=c-b;
System.out.println("--------------------------");
System.out.println("Variables after swapping :");
System.out.println(a);
System.out.println(b);
}
}