// 1 2 3 4 5 7 8 9 10 11 12 13 14 15 16 17 18 19 20
// 8 9 10 & 14 15 16
import java.util.*;
public class CompoC
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("Limit :");
int l=sc.nextInt();
int f1,f2,f3,i;
CompoC b=new CompoC();
for(i=1;i<l-1;i++)
{
f1=b.c(i);
f2=b.c(i+1);
f3=b.c(i+2);
if(f1==1&&f2==1&&f3==1)
System.out.print("\n"+i+" "+(i+1)+" "+(i+2)+"\n");
}
}
int c(int n)
{
int f=0;
for(int i=2;i<n;i++)
if(n%i==0)
f=1;
return f;
}
}