/* 
WAP to accept a string. Convert it to uppercase. Count and output 
the number of double letter words that exist in the string.   
Sample Input: SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE
Sample Output:   4
                                                     [ICSE 2012]
*/
import java.io.*;
class Double_Letter  
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a String :");
String s1=br.readLine();
String s=s1.toUpperCase();
int l=s.length();
int c=0;
for( int p=0; p<l-1;  p++)
{
if(s.charAt(p)==s.charAt(p+1))
c++;
}//for ends
System.out.println("Number of double letter Alphabets :"+c);
}//method ends
}//class ends

