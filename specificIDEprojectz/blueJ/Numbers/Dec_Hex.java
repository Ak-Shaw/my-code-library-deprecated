//Accept a decimal no. and display its quivalent Hexadecimal no.
import java.io.*;
public class Dec_Hex
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,r;
String s="",v="";
System.out.print("Decimal Number :");
n=Integer.parseInt(br.readLine());
while(n>0)
{
r=n%16;
/*
 * if(r>=10&&r<=15)
 * v=v+(char)(r+55);
 * else
 * v=Integer.toString(r);
 */
if(r==10)
v="A";
else if(r==11)
v="B";
else if(r==12)
v="C";
else if(r==13)
v="D";
else if(r==14)
v="E";
else if(r==15)
v="F";
else
v=Integer.toString(r);
n/=16;
s=v+s;
}
System.out.println("Hexadecimal no.:"+s);
}
}