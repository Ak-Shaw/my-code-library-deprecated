/*
This is the Java programming code written in BlueJ which swaps the values of two Strings without using any third (temp) variable.
Programming Code:
Swap_Strings 
Java
*/
/**
* The class Swap_Strings takes 2 Strings as input and swaps their value without using any 3rd variable
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/
import java.io.*;
class Swap_Strings
{
    public static void main ()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter the 1st String : ");
        String s1=br.readLine();
        int len1=s1.length();
        System.out.print("Enter the 2nd String : ");
        String s2=br.readLine();
        System.out.println("-------------------------------");
        System.out.println("Strings Before Swapping : ");
        System.out.println("1st String = "+s1);
        System.out.println("2nd String = "+s2);
        /*Swapping Process Begins*/
        s1=s1+s2;
        s2=s1.substring(0,len1);
        s1=s1.substring(len1);
        /*Swapping Process Ends*/
        System.out.println("-------------------------------");
        System.out.println("Strings After Swapping : ");
        System.out.println("1st String = "+s1);
        System.out.println("2nd String = "+s2);
    }
}
/**
Output:
Enter the 1st String : Java For
Enter the 2nd String : School is Fun
——————————-
Strings Before Swapping :
1st String = Java For
2nd String = School is Fun
——————————-
Strings After Swapping :
1st String = School is Fun
2nd String = Java For
Working:
Initially s1 = “Java For” and s2 = “School is Fun”,
Now, the variable, ‘len1′ stores the length of the 1st String. Hence, in this case, ‘len1′ = 8
Step 1: s1 = s1+s2; gives s1 = “Java For”+”School is Fun”;
i.e. s1 = “Java ForSchool is Fun” [Note: There will be no space when we join the 1st and the 2nd String]
Step 2: s2=s1.substring(0,len1); gives, s2=”Java ForSchool is Fun”.substring(0,8);
i.e. s2 = “Java For”
Step 3: s1 = s1.substring(len1); gives, s1 = “Java ForSchool is Fun.substring(8);
i.e. s1 = “School is Fun”
Hence, finally we have s1 = “School is Fun” and s2 = “Java For”. [Swapping Done]
*/


