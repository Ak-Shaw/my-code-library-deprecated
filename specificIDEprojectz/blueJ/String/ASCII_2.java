/* WAP to accept a ASCII value and display its specified character.
 * Also display an error message if an inappropriate ASCII value is given.
 * 
 * Sample Input  ---> 38
 * Sample Output ---> Specified Character Of ASCII Value 38 : &
 * 
 * Sample Input  ---> 260
 * Sample Output ---> Not an ASCII Value!
 *                    Specified Character Of Code Value 260 :Ą
 * 
 * Sample Input  ---> 2555
 * Sample Output ---> Not an ASCII Value!
 *                    Specified Character Of Code Value 2555 :৻                  
 */
import java.io.*;
public class ASCII_2
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.print("Enter a Code Value :");
int n=Integer.parseInt(br.readLine());
char ch=(char)n;
if(n<0||n>255)
{
System.out.println("Not an ASCII Value!");
str= "Code";
}
else
str="ASCII";
System.out.println("Specified Character Of "+str+" Value "+n+" : "+ch);
}
}