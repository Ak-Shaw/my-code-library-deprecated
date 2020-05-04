/* Accept a word and remove some characters according to from one index
 * number to another position.
 */
import java.io.*;
public class Remove_1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String word;
int index,pos;
System.out.print("Enter a word:");
word=br.readLine();
StringBuffer p=new StringBuffer(word);
System.out.print("Enter the starting index :");
index=Integer.parseInt(br.readLine());
System.out.print("Enter the ending position :");
pos=Integer.parseInt(br.readLine());
System.out.println("The new word is :"+p.delete(index,pos));
}
}