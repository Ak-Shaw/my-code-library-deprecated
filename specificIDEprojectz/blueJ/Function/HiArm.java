/*
 * A class HiArm has been defined to find whether a given number is armstrong
 * or not. Some members of the class are given below :
 * 
 * Class name                      :  HiArm
 * 
 * Data members/Instance variables : 
 *           n                     :  Integer data to store the number
 *                
 * Member functions/methods        :
 *           HiArm()               :  constructor to assign 0 to n
 *           HiArm(int a)          :  constructor to assign a to n
 *           int sumArm(int)       :  to find and return the sum of cube 
 *                                    of digits of a number  
 *           void isArm()          :  to invoke sumArm() and print whether the
 *                                    number is Armstrog or not
 *          
 *          Then write the main() method to input a number and call the above
 * methods as required to check whether it is an Armstong number or not
 * 
 * [Note : An Armstrong number is a number which is equal to the sum of the
 * cube of its digits. Example of an Armstrong number is 153 = 1^3 + 5^3 + 3^3
 * = 153]
 */
import java.util.*;
public class HiArm
{
int n;
HiArm()
{
n=0;
}
HiArm(int a) 
{
n=a;
}
int sumArm(int a)
{
int d,s=0;
while (a>0)
{
d=a%10;
s+=d*d*d;
a/=10;
}
return(s);
}
void isArm()
{
HiArm obj=new HiArm();
int sum=obj.sumArm(n);
if(sum==n)
System.out.println(n+" is an Armstrong number");
else
System.out.println(n+" is not an Armstrong number");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number :");
int num=sc.nextInt();
HiArm ob=new HiArm();
HiArm ob1=new HiArm(num);
ob1.isArm();
}
}