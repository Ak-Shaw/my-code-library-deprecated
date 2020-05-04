/*Write a class Rectangle with the following specifications :
 * 
 * Data Members   : int length, int breadth
 * Member Methods : 
 *    void input_data() : To accept length and breadth
 *    void calculate()  : To calculate area, perimeter and diagonal
 *                        and to send these values as parameters
 *                        to void output_data
 *    void output_data(int x,int y,int z): To accept the values
 *                                         and give the result
 * 
 * Create a main() to call the above methods void input_data and
 *                                           void calculate
 * [Hint : Create an object in void calculate and call 
 *                                                  void output_data]
 * 
 */
import java.io.*;
public class Rectangle
{
int length,breadth;
void input_data()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Length :");
length=Integer.parseInt(br.readLine());
System.out.print("Breadth :");
breadth=Integer.parseInt(br.readLine());
}
void calculate()
{
int a=length*breadth;
int p=2*(length+breadth);
double d1=Math.sqrt(length*length+breadth*breadth);
int d=(int)d1;
Rectangle ob=new Rectangle();
ob.output_data(a,p,d);
}
void output_data(int x,int y,int z)
{
System.out.println("Area :"+x);
System.out.println("Perimeter :"+y);
System.out.println("Diagonal :"+z);
}
public static void main(String args[])throws IOException
{
Rectangle ob1=new Rectangle();
ob1.input_data();
ob1.calculate();
}
}