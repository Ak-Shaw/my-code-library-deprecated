// Program to obtain numbers and display their sum
import java.util.*;
public class SLoop
{
public static void main(String args[])
{
double n;
double sum=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter number, non number will stop input !");
while(in.hasNextDouble())
{
n=in.nextDouble();
sum+=n;
}
in.close();
System.out.println("The total is "+sum);
}
}
