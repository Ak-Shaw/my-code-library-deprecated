/* A cloth showroom has announced the following discounts on 
 * the purchase of items, based on the total cost of the items 
 * purchased :-
 * 
 * Total Cost           Discount(in Percentage)
 * Less than Rs. 2000            5%
 * Rs. 2001 to Rs.5000           25%
 * Rs. 5001 to Rs.10000          35%
 * Above Rs.10000                50%
 * 
 * WAP to input the total cost and to compute and display the
 * amount to be paid by the customer after availing the
 * discount
 *                                            [ICSE 2006]
 */
import java.io.*;
public class Cloth_Cost
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Total Amount : Rs.");
double n=Double.parseDouble(br.readLine());
double d=0;
if(n<=2000)
d=n/20;
if(n>2000&&n<=5000)
d=n/4;
if(n>5000&&n<=10000)
d=n*7/20;
if(n>10000)
d=n*50/100;
System.out.println("Discount : Rs."+d);
double a=n-d;
System.out.println("Bill : Rs."+a);
}
}