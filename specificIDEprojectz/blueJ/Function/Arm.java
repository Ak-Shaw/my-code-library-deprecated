import java.io.*;
public class Arm
{
int n;
Arm()
{
n=0;
}
Arm(int a)
{
n=a;
}
int sumArm(int n1)
{
int d,s=0;
while(n1>0)
{
d=n1%10;
s+=d*d*d;
n1/=10;
}
return (s);
}
void isArm()
{
int n3=n;
Arm ob1=new Arm();
int s1=ob1.sumArm(n3);
if(s1==n)
System.out.println("Armstrong Number");
else
System.out.println("Not an Armstrong Number");
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Number :");
int n2=Integer.parseInt(br.readLine());
Arm ob=new Arm(n2);
ob.isArm();
}
}