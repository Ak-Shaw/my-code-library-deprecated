/* WAP to accept a word and display it in Piglatin form without
 * using String function substring().
 * 
 * A word is said to be Piglatin, when it is obtained by framing a new with the first vowel 
 * present in the word with the remaining letters before the first vowel and ends with "ay".
 * 
 * Sample Input  ---> Ayush
 * Sample Output ---> The Piglatin form of Ayush : Ayushay
 * 
 * Sample input  ---> Chalk
 * Sample Output ---> The Piglatin form of Chalk : alkChay
 */
import java.util.*;
public class Piglatin_3
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("Word :");
String s=sc.next();
int i,j=0,l=s.length();
char c,c1;
String q="",w="";
for(i=0;i<l;i++)
{
c=s.charAt(i);
c1=Character.toUpperCase(c);
if(c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U')
j++;
if(j<1)
q+=c;
else
w+=c;
}
System.out.println("Piglatin Form :"+w+q+"ay");
}
} 
