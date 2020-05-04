/*(WRONG)
Design a class to overload a function polygon() as follows:       
(i) void polygon(int n, char ch)  : with one integer argument 
                                    and one character type argument 
                                    that draws a filled square of side n 
                                    using the character stored in ch.
(ii) void polygon(int x, int y)   : with two integer arguments that 
                                    draws a filled rectangle of length 
                                    x and breadth y, using the symbol ‘@’
(iii) void polygon()              : with no argument that draws a filled 
                                    triangle shown below:
                                    *
                                    * *
                                    * * *
                                                      [ICSE 2012]
*/
import java.io.*;
class Polygon  
{
void polygon(int n , String ch)   
{
for (int  p= 1;  p<=n;  p++)
{
for(int q=1; q<=n; q++)
System.out.print(ch);
System.out.println();
}
}//method ends
void  polygon(int x, int y)  
{
for(int p = 1;   p<=x;  p++)
{
for ( int q=1;  q<=y; q++)
System.out.print("@");
System.out.println();
}
}//method ends
void polygon()  
{
for(int p= 1; p<=3; p++)
{
for( int q=1; q<=p; q++)
System.out.print("*");
System.out.println();
}
}//method ends
public static void main(String args[])throws IOException
{//main method starts
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
Polygon ob=new Polygon();
System.out.println("Enter Arguments for Square :");
System.out.print("Enter Side :");
int a=Integer.parseInt(br.readLine());
System.out.print("Enter a Character :");
String c=br.readLine();
System.out.println("Enter Arguments for Rectangle :");
System.out.print("Enter Length :");
int l=Integer.parseInt(br.readLine());
System.out.print("Enter Breadth :");
int b=Integer.parseInt(br.readLine());
ob.polygon(a,c);
ob.polygon(l,b);
ob.polygon();
}//main method ends
}//class ends
