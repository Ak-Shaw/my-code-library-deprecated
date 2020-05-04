/* 
Given below is a hypothetical table showing rates of income tax for 
male citizens below the age of 65 yrs:
Does not exceed Rs. 1,60,000        -nil
Is > Rs. 1,60,000 & <=Rs. 50,000   – (TI- 1,60,000)*10%
Is >Rs.5,00,000  & <=Rs. 8,00,000  -  [(TI-5,00,000)*20%]+34,000
Is >Rs. 8,00,000 – [(TI-8,00,000)*30%]+94,000
Write a program to input the age, gender(male or female) and taxable 
income(TI) of a person.
If the age is more than 65 yrs or the gender is female, display 
“wrong category”.
If the age is less than or equal to 65 yrs and the gender is male, 
compute and display the income tax payable as  per the table given above.
                                                  [ICSE 2012]
*/
import java.io.*;
class IncomeTax 
{
public static void main(String args[]) throws IOException
{
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter Age :");
int age=Integer.parseInt(ob.readLine());
System.out.print("Enter Gender :");
String gender= ob.readLine();
System.out.print("Enter Taxable Income :");
long TI=  Long.parseLong(ob.readLine());
double tax=0.0;
if((age>65) || (gender.equalsIgnoreCase("Female")))
System.out.println("Wrong Category");
else if((age<=65) && (gender.equalsIgnoreCase("Male")))
{
if(TI<160000)
tax=0;
else if(TI>160000 && TI<=500000)
tax=(TI-160000)*(double)10/100*TI;
else if(TI>500000 && TI<=800000)
tax=(TI-500000)*((double)20/100*TI)+34000;
else
tax=(TI-800000)*((double)30/100*TI)+94000;
}
else
System.out.println("Wrong Category");
System.out.println("Tax :"+tax);
}//main  ends
} //class ends
