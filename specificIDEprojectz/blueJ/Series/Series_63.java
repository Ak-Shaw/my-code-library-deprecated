/*
 * 1+2    1+2+3         1+2+3+4+...+n
 * ____ + _____ +......+_____________
 * 1*2    1*2*3         1*2*3*4*...*n
 */
public class Series_63
{
public static void main(int n)
{
int i,t=1,f=1;
double b,s=0.0;
for(i=1;i<=n;i++)
{
t=t+(i+1);
f=f*(i+1);
System.out.print(t+"/"+f+" ");
b=t/f;
s+=b;
}
System.out.println("\nSum="+s);
}
}