// Impure function without parameters with calling to add two numbers
public class Fun_6
{
public void add()
{
int a=15,b=12;
int c=a+b;
System.out.println("Sum ="+c);
}
public static void main(String args[])
{
Fun_6 ob=new Fun_6();// Object Creation
ob.add();// Calling Function
}
}