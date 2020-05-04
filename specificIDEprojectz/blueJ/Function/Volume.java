/*
Write a class with the name volume using function overloading that 
computes the volume of a cube, a sphere and a cuboid.
Formula :
volume of a cube (vc)      = s*s*s
volume of a sphere (vs)    = 4/3*pi*r*r*r
(where pi = 3.14 or 22/7)
Volume of a cuboid (vcd)   = l*b*h
                                                     [ICSE 2008]
*/
import java.io.*;
public class Volume
{
double pi=3.14;
public void overloading(int s)
{
System.out.println("Cube Volume :"+(s*s*s));
}
public void overloading(double r)
{
System.out.println("Sphere Volume :"+(4/3*pi*r*r*r));
}
public void overloading(int l,int b,int h)
{
System.out.println("Cuboid Volume :"+(l*b*h));
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Volume ob=new Volume();
System.out.print("Edge of Cube :");
int s1=Integer.parseInt(br.readLine());
ob.overloading(s1);
System.out.print("Radius of Sphere :");
double r1=Double.parseDouble(br.readLine());
ob.overloading(r1);
System.out.println("Cuboid----->");
System.out.print("Length :");
int l1=Integer.parseInt(br.readLine());
System.out.print("Breadth :");
int b1=Integer.parseInt(br.readLine());
System.out.print("Height :");
int h1=Integer.parseInt(br.readLine());
ob.overloading(l1,b1,h1);
}
}
