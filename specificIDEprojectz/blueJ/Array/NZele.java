import java.util.*;
public class NZele
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the nth term");
int n=sc.nextInt();
int arr[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.print("arr["+i+"]["+j+"]=");
arr[i][j]=sc.nextInt();
}
}
System.out.println("Number of Rows\tNumber of Columbs\tNon-Zero elements");
System.out.println("----------------------------------------------------------");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(arr[i][j]!=0)
System.out.print((i+1)+"\t\t"+(j+1)+"\t\t"+arr[i][j]);
System.out.println();
}
}
}
}