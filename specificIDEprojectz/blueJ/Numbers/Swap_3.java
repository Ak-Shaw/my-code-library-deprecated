// Swap two variables without using third variable 
// Direct Method
import java.io.*;
public class Swap_3
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
a=a+b;
b=a-b;
a=a-b;
System.out.println("--------------------------");
System.out.println("Variables after swapping :");
System.out.println(a);
System.out.println(b);
}
}