/*
The use of StringTokenizer class for extracting words from the sentence, solves the problems you have highlighted.
Here is the code for that:
Java
*/
/**
* The class StringTokenizer_Sample1 finds and displays the shortest and the longest word in a sentence along with their lengths
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/
 
import java.io.*;
import java.util.*;
class String_Tokenizer
{
static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
    public static void main ()throws IOException
    {
        System.out.print("Enter any sentence : ");
        String s=br.readLine();
        int len=s.length(); //finding the length of the sentence
        String x="",maxw="",minw="";
        char ch;
        int p,maxl=0,minl=len;
        StringTokenizer str = new StringTokenizer(s,";?'. :,"); //converting String into StringTokenizer object
        int c=str.countTokens(); 
        for(int i=0;i<c;i++)
        {
            x=str.nextToken(); //extracting tokens (i.e. words) one at a time
            p=x.length();
                if(p<minl) //checking for minimum length
                {
                    minl=p;
                    minw=x;
                }
                if(p>maxl) //checking for maximum length
                {
                    maxl=p;
                    maxw=x;
                }
        }
        System.out.println("Shortest word = "+minw+"\nLength = "+minl);
        System.out.println("Longest word = "+maxw+"\nLength = "+maxl);
    }
} 



