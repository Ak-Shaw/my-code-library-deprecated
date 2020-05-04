// Impure function with parameters with calling to add two numbers
// Pass by value
public class Fun_8
{
public void add(int a,int b)
{
int c=a+b;
System.out.println("Sum ="+c);
}
public static void main(String args[])
{
Fun_8 ob=new Fun_8();// Object Creation
ob.add(15,12);// Calling Function
}
}
