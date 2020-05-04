/* Accept the sentence January 26 is the Republic day of India and 
 * replace the word January to August, 26 to 15 and Republic to
 * Independence
 */
public class Replace_1
{
public static void main(String args[])
{
String str1="January 26 is the Republic day of India";
String str2=str1.replace("January 26","August 15");
String str3=str2.replace("Republic","Independece");
System.out.println("Given String :"+str1);
System.out.println("Changed String :"+str3);
}
}