/**
   Display the following with the help of menu driven program
   
   The area and the perimeter of a rectangle
   The area and the perimeter of a square
   The area and the circumference of a circle
   The area and perimeter of a triangle
                                            [Using Function]
 */
import java.io.*;
public class Area
{
int l,b,Ra,Rp;
int S,Sa,Sp;
double r,Ca,Cp;
double pie;
int x,y,z;
double Ts,Ta;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Area()
{
pie=22.0/7;
}
public void Rectangle()throws IOException
{
System.out.print("Lenght :");
l=Integer.parseInt(br.readLine());
System.out.print("Breadth :");
b=Integer.parseInt(br.readLine());
Ra=l*b;
Rp=2*(l+b);
System.out.println("Area :"+Ra);
System.out.println("Perimeter :"+Rp);
}
public void Square()throws IOException
{
System.out.print("Side :");
S=Integer.parseInt(br.readLine());
Sa=S*S;
Sp=4*S;
System.out.println("Area :"+Sa);
System.out.println("Perimeter :"+Sp);
}
public void Circle()throws IOException
{
System.out.println("Radius :");
r=Double.parseDouble(br.readLine());
Ca=pie*r*r;
Cp=2*pie*r;
System.out.println("Circumference :"+Cp);
System.out.println("Area :"+Ca);
}
public void Triangle()throws IOException
{
System.out.print("Side 1:");
x=Integer.parseInt(br.readLine());
System.out.print("Side 2:");
y=Integer.parseInt(br.readLine());
System.out.println("Side 3 :");
z=Integer.parseInt(br.readLine());
int p=x+y+z;
Ts=p/2;
Ta=Math.sqrt(Ts*(Ts-x)*(Ts-y)*(Ts-z));
System.out.println("Perimeter :"+p);
System.out.println("Area :"+Ta);
}
public static void main()throws IOException
{
char ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Area ob=new Area();
System.out.println("Press R for Rectangle");
System.out.println("Press S for Square");
System.out.println("Press C for Circle");
System.out.println("Press T for Triangle");
System.out.println("Enter Your Choice :");
ch=(char)br.read();
switch(ch)
{
case'R':case'r':
ob.Rectangle();
break;
case'S':case's':
ob.Square();
break;
case'C':case'c':
ob.Circle();
break;
case'T':case't':
ob.Triangle();
break;
default:
System.out.println("Wrong Choice! Sorry!!");
}
}
}
