/* WAP to check and display whether a number input by the user is a
 * composite number or not (A number is said to be composite, if it 
 * has one or more than one factor excludong 1 and the number itself).
 * 
 * Example : 4, 6, 8, 9 ...
 *                                                       [ICSE 2013]
 */
import java.io.*;
public class Composite_Prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,c=0;
System.out.print("Enter a Number :");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
c++;
}
if(c>2)
System.out.println(n+" is a Composite Number");
else if(c==2)
System.out.println(n+" is a Prime Number");
else 
System.out.println(n+" is neither composite nor prime");
}
}
/** ALTERNATIVE METHOD
 * METHOD (I) --->
 * import java.io.*;
public class Composite_Prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,c=0;
System.out.print("Enter a Number :");
n=Integer.parseInt(br.readLine());
if(n>0)
{
for(i=2;i<n;i++)
{
if(n%i==0)
c=1;
}
}
else
{
for(i=n-1;i<=-2;i++)
{
if(n%i==0)
c=1;
}
}
if(c==1)
System.out.println(n+" is a Composite Number");
else
System.out.println(n+" is a Prime Number");
}
}

METHOD (II)--->
import java.io.*;
public class Composite_Prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,c=0;
System.out.print("Enter a Number :");
n=Integer.parseInt(br.readLine());
if(n>0)
{
for(i=2;i<=n/2;i++)
{
if(n%i==0)
c=1;
}
}
else
{
for(i=n/2;i<=-2;i++)
{
if(n%i==0)
c=1;
}
}
if(c==1)
System.out.println(n+" is a Composite Number");
else
System.out.println(n+" is a Prime Number");
}
}
 */