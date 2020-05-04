/*
 * Accept a number and check whether it is a Kaprekar number or not.
 * 
 * Such as, 9^2 = 81 - > 8 | 1 - > 8 + 1 = 9 is a Kaprekar number
 * 
 *         45^2 = 2025 - > 20 | 25 - > 20 + 25 = 45 is a Kaprekar number
 */
public class Kaprekar
{
public static void main(double a)
{
int ar=(int)a;
int as=ar*ar;
int ad=as;
int c=0;
while(as>0)
{
as/=10;
c++;
}
int z1=c/2;
int z2=c-z1;
int g=ad%((int)Math.pow(10,z2));
int n=(ad-g)/((int)Math.pow(10,z2));
if((g+n)==ar)
System.out.println(ar+" is a Kaprekar number");
else
System.out.println(ar+" is not a Kaprekar number");
}
}
