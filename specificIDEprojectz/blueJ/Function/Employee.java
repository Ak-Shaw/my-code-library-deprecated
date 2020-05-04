/*
Define a class Employee having the following description :    
Instance variables  :
int pan             to store personal account number
String name         to store name
double tax income   to store annual taxable income
double tax          to store tax that is calculated
Member functions :
input ( )     Store the pan number, name, taxable income
calc( )       Calculate tax for an employee
display ( )   Output details of an employee
Write a program to compute the tax according to the given conditions 
and display the output as per given format.
Total Annual Taxable Income                 Tax Rate
Upto Rs, 1,00,000                            No tax
From 1,00,001 to 1,50,000      10% of the income exceeding Rs. 1,00,000
From 1,50,001 to 2,50,000      Rs. 5000 + 20% of the income exceeding 
                               Rs. 1,50,000
Above Rs. 2,50,000             Rs. 25,000 + 30% of the income exceeding 
                               Rs. 2,50,000
Output :
Pan Number    Name      Tax-income    Tax
    __         __           __         __
                                                  [ICSE 2008]
*/
import java.io.*;
public class Employee
{
int pan;
String name;
double tax_income,tax;
void input ()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("PAN - Personal Account Number :");
pan=Integer.parseInt(br.readLine());
System.out.print("Name :");
name=br.readLine();
System.out.print("Taxable Income :");
tax_income=Double.parseDouble(br.readLine());
}
void calc()
{
if(tax_income<=100000.0)
tax=0.0;
else if(tax_income>100000.0&&tax_income<=150000.0)
tax=(tax_income-100000.0)/10;
else if(tax_income>150000.0&&tax_income<=250000.0)
tax=(tax_income-150000.0)/5+5000.0;
else
tax=(tax_income-250000.0)*3/10+25000.0;
}
void display ()
{
 System.out.println("Pan Number\tName\t\tTax-income\t\tTax");
 System.out.println(pan+"\t\t"+name+"\t"+tax_income+"\t"+tax);
}
public static void main(String args[])throws IOException
{
Employee ob=new Employee();
ob.input();
ob.calc();
ob.display();
}
}