// Calculator
import java.io.*;
public class Calculator
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,e1;
double c,d,e2;
System.out.println("Calculator : Enter specific keys for their respective actions");
System.out.println("Press 1 for addition");
System.out.println("Press 2 for substraction");
System.out.println("Press 3 for multiplication");
System.out.println("Press 4 for finding quotient");
System.out.println("Press 5 for finding remainder");
System.out.println("Press 6 for division");
System.out.println("Press 7 to round up");
System.out.println("Press 8 to round up to lowest value");
System.out.println("Press 9 to round up to highest value");
System.out.println("Press 10 to find square root");
System.out.println("Press 11 to find Percentage");
System.out.println("Press 12 to find absolute value");
System.out.println("Press 13 to find Sine");
System.out.println("Press 14 to find Cosine");
System.out.println("Press 15 to find Tangent");
System.out.println("Enter Your Action");
int s=Integer.parseInt(br.readLine());
switch(s)
{
case 1:
System.out.print("Enter 1st number :");
a=Integer.parseInt(br.readLine());
System.out.print("Enter 2nd number :");
b=Integer.parseInt(br.readLine());
System.out.println("Sum ="+(a+b));
break;
case 2:
System.out.print("Enter 1st number :");
a=Integer.parseInt(br.readLine());
System.out.print("Enter 2nd number :");
b=Integer.parseInt(br.readLine());
System.out.println("Answer ="+(a-b));
break;
case 3:
System.out.print("Enter 1st number :");
a=Integer.parseInt(br.readLine());
System.out.print("Enter 2nd number :");
b=Integer.parseInt(br.readLine());
System.out.println("Product ="+(a*b));
break;
case 4:
System.out.print("Enter 1st number :");
a=Integer.parseInt(br.readLine());
System.out.print("Enter 2nd number :");
b=Integer.parseInt(br.readLine());
e1=a/b;
System.out.println("Quotient ="+e1);
break;
case 5:
System.out.print("Enter 1st number :");
a=Integer.parseInt(br.readLine());
System.out.print("Enter 2nd number :");
b=Integer.parseInt(br.readLine());
e1=a%b;
System.out.println("Remainder ="+e1);
break;
case 6:
System.out.print("Enter 1st number :");
c=Double.parseDouble(br.readLine());
System.out.print("Enter 2nd number :");
d=Double.parseDouble(br.readLine());
e2=c/d;
System.out.println("Answer ="+e2);
break;
case 7:
System.out.print("Enter a number :");
c=Double.parseDouble(br.readLine());
e2=Math.round(c);
System.out.println("Round Value ="+e2);
break;
case 8:
System.out.print("Enter a number :");
c=Double.parseDouble(br.readLine());
e2=Math.floor(c);
System.out.println("Round Value ="+e2);
break;
case 9:
System.out.print("Enter a number :");
c=Double.parseDouble(br.readLine());
e2=Math.ceil(c);
System.out.println("Round Value ="+e2);
break;
case 10:
System.out.print("Enter a number :");
c=Double.parseDouble(br.readLine());
e2=Math.sqrt(c);
System.out.println("Square Root ="+e2);
break;
case 11:
System.out.print("Enter 1st number :");
c=Double.parseDouble(br.readLine());
System.out.print("Enter 2nd number :");
d=Double.parseDouble(br.readLine());
e2=c/d*100;
System.out.println("Percentage ="+e2+"%");
break;
case 12:
System.out.print("Enter a number :");
c=Double.parseDouble(br.readLine());
e2=Math.abs(c);
System.out.println("Absolute Value ="+e2);
break;
case 13:
System.out.print("Degree Value :");
c=Double.parseDouble(br.readLine());
e2=Math.sin(c);
System.out.println("Sine Value ="+e2);
break;
case 14:
System.out.print("Degree Value :");
c=Double.parseDouble(br.readLine());
e2=Math.cos(c);
System.out.println("Cosine Value ="+e2);
break;
case 15:
System.out.print("Degree Value :");
c=Double.parseDouble(br.readLine());
e2=Math.tan(c);
System.out.println("Tangent Value ="+e2);
break;
default:
System.out.println("Sorry! Wrong Choice");
}
}
}


