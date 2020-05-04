/*
 * Accept a number and check whether it is a Buzz number or not.
 *      
 *      A number is said to be a Buzz number if the number is either 
 * divisible by 7 or the last digit of that number is 7.
 * 
 *    Such as 21 is divisible by 7 and 27 has 7 as its last digit,
 *                      Hence these are Buzz numbers.
 */
public class Buzz
{
public static void main(int n)
{
if(n%7==0||n%10==7)
System.out.println(n+" is a Buzz number");
else
System.out.println(n+" is not a Buzz number");
}
}