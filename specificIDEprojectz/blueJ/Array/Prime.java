/*
        WAP to accept ten numbers in a S.D.A. and display
        only the prime numbers and also display how many
        prime numbers are there.
 */
import java.io.*;
public class Prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,k=0;
int a[]=new int[10];
for(i=0;i<10;i++)
{
System.out.print("Enter integer no."+(i+1)+":");
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<10;i++)
{
for(j=2;j<a[i];j++)
{
if(a[i]%j==0)
break;
}
if(j==a[i])
{System.out.println(a[i]);
k++;
}
}
System.out.println(k+" prime numbers are present");
}
}