/*
Question:
Write a program in JAVA to find the Prime factors of a number.
Prime factors of a number are those factors which are prime in nature and by which the number itself is completely divisible (1 will not be taken as prime number).
Few such numbers are:
Prime Factors of 24 are 2, 2, 2, 3
Prime Factors of 6 are 2, 3
Solution:
PrimeFactors 
Java
*/
/**
* The class PrimeFactors inputs a number and prints all its PrimeFactors
* @author www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/
import java.io.*;
class Prime_Fac_2
{
public static void main() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.print("Enter a Number : ");
n=Integer.parseInt(br.readLine());
System.out.print("The Prime Factors of "+n+" are : ");
int i=2;
while(n>1)
{
if(n%i == 0)
{
System.out.print(i+" ");
n=n/i;
}
else
i++;
}
}
}
/**
Output:
Enter a Number : 378
The Prime Factors of 378 are: 2  3  3  3  7
Explanation:
In this program we have implemented the very traditional method of finding the prime factors of a number, which we all used in junior classes.
When we were told to find the HCF of 2 numbers, we first used to find the Prime Factors of both the numbers separately and then used to take the common factors and multiply them for finding the HCF – Remember?
And we used to first start dividing that number by 2, then if it was divisible, we would again divide it by 2 and this would go on till it is being divided by 2, then we moved on to check its divisibility by 3, then with 5, 7 etc. We used to divide, until we reached 1, after which we used to stop.
2 | 24  
2 | 12  
2 | 6    
3 | 3  
   | 1
Remember, the above method? And the Prime Factors using the above method would come as 2, 2, 2, 3 for 24.
This is the very logic being used in the above program.
1. We start dividing the number by 2, hence, the value of ‘i’ begins with 2.
2. If it is divisible, then the value of ‘i’ is printed, and the next number becomes (n/i) , like we used to have in our junior arithmetic.
3. If it is not divisible by 2, then the value of ‘i’ is incrementing.
4. And this checking goes on till the number is greater than 1, because if it becomes 1, we need to stop this process of dividing.

Source: http://www.javaforschool.com/274-program-to-find-the-prime-factors-of-a-number-method-1/#ixzz2eqGbSoOv
*/
