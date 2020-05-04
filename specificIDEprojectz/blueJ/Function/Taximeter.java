/* Define a clss taximeter having following description :-
 * 
 * Data Members / Instance Variables :-
 * 
 * int taxino.  - To store taxi number
 * String name  - To store Passenger Name
 * int km       - To store no. of kilometers travelled
 * double b     - To claculate the bill
 * 
 * Member Functions :-
 * 
 * taximeter()  - Constructor to initialise:-
 *                taxino. to 0
 *                name to ""
 *                b to 0
 * input()      - To store taxino., name, km
 * calculate()  - To calculate bill for a customer for given tarrif
 * kilometers travelled(km)    Rate/km
 * km <=1                      Rs. 25
 * 1 < km <=6                  Rs. 10/km
 * 6 < km <=12                 Rs. 15/km
 * 12 < km <=18                Rs. 20/km
 * 18 < km                     Rs. 25/km  
 * display()     To display the details in following format :-
 *                Taxino  Name  Kilometers travelled  Bill Amount
 *                   -        -        -            -
 * 
 * Create an object in the main method and call all theabove methods in
 * it.
 *                                            [ICSE 2012 Specimen]
 */
import java.io.*;
public class Taximeter
{
 int taxino,km;
 String name;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 Taximeter()
 {
  taxino=0;
  km=0;
  name="";
  }

public void input()throws Exception
{
 System.out.print("Enter the Name:");
 name=br.readLine();
  System.out.print("Enter the Taxi Number:");
 taxino=Integer.parseInt(br.readLine());
  System.out.print("Enter the km Travelled:");
 km=Integer.parseInt(br.readLine());
 }
 public void calculate()
 {
 System.out.println("Taxino \t Name \t Kilometres travelled \t Bill amount");
 System.out.print(" "+taxino+" \t"+name+"\t\t"+km+"\t\t");
 if(km<1 )
 System.out.println("  Rs. 25");
 else if(km>=1 && km<=6)
 System.out.println("  Rs."+(20*km));
 else if(km>6 && km<=12)
 System.out.println("  Rs."+(18*km));
 else if(km>12 && km<=18)
 System.out.println("  Rs."+(15*km));
 else if(km>18 )
 System.out.println("  Rs."+(10*km));
}

public static void main(String args[])throws Exception
{
Taximeter ob=new Taximeter();
ob.input();
ob.calculate();
}
 }

