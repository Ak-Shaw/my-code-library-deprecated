// s = 7.7 + 77.77 + 777.777 + 7777.7777 +.....+ to 7 terms
public class Series_64
{
public static void main(String args[])
{
int a=7;
for(int i=0;i<7;i++)
{
for(int k=0;k<=i;k++)
System.out.print(a);
System.out.print(".");
for(int k=0;k<=i;k++)
System.out.print(a);
if(i!=(7-1))
System .out.print(" + ");
}
System.out.println();
}
}
/**
 * ALTERNATIVE METHOD --->
public class Series_64
{
public static void main(String args[])
{
int i,a=0;
double b,s=0;
for(i=1;i<=4;i++)
{
a=a*100+77;
b=a/Math.pow(10,i);
System.out.print(b+" ");
s+=b;
}
System.out.println("\nSum of the Series ="+s);
}
}

Note : This method is applicable only upto 4 terms 
*/