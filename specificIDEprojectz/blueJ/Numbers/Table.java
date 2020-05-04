import java.util.*;
public class Table
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number :");
int n=sc.nextInt();
System.out.println("Table of "+n+" :\n");
for(int i=1;i<11;i++)
System.out.println(n+" * "+i+"\t= "+(n*i));
}
}