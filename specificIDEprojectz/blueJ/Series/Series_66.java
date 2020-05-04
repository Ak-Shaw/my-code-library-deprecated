// 131 228 331 430 ...to 12 terms
public class Series_66
{
public static void main()
{
int i,n=30,y;
for(i=1;i<13;i++)
{
if(i==8)
n--;
if(i<8)
{
if(i%2==0)
n--;
else
n++;
}
else
{
if(i%2==0)
n++;
else
n--;
}
y=n;
if(i==2)
y=28;
System.out.print(" "+(i*100+y));
}
}
}