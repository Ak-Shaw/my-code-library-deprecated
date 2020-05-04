/*
       WAP to accept a sentence and display the palindrome
       words present in the sentence
 */
import java.io.*;
public class PalindromeWords
{
        public static void main()throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a sentence:");
            String s=br.readLine()+" ",ns="",nw="";           
            int l=s.length(),c=0,i;
            char b;
            System.out.println("\n\nPalindrome Words are :\n");
            for(i=0;i<l;i++)
            {
                b=s.charAt(i);
                if(b==' ')
                {
                    if(ns.equalsIgnoreCase(nw)==true)
                    {
                        System.out.println(ns);
                        c++;
                    }
                    ns="";
                    nw="";
                }
                else
                {
                    ns+=b;
                    nw=b+nw;
                }
            }
            if(c==0)
            System.out.println("\n\nNo Palindrome words");
        }
}
    /**
                        VARIABLE DESCRIPTION
         
          Object        Class
          
            br       BufferedReader
            
          Variable      Datatype        Purpose
          
             s           String     To accept a sentence
             ns          String     To extract each word
             nw          String     To reverse each word
             l            int       To calculate length of s
             c            int       Counting the palindrome words
             i            int       Looping
             b            char      Extracting each character
         
     */
    /**
                ALGORITHM
                
         s contains the inputted sentence
         l is the length of the sentence
         
         Step 1 : Initialize i=0
         Step 2 : Repeat Steps 3-6 while(i<l)
                  b contains the character at i
         Step 3 : if(b==' ') is true 
                       then compare nw with ns,
                          where ns is each word and nw the
                          same word reversed
         Step 4 : If true then increase the value of c by 1
         Step 5 : Initialize ns and nw to ""
         Step 6 : Increase i by 1
         Step 7 : Exit
     */