//WAP to input a string and print the frequency of each character.
import java.io.*;
public class Frequency
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n;
        char c,ch;
        System.out.println("Enter a String :");
        String a=br.readLine();
        int l=a.length();        
        System.out.println("ALPHABETS \t FREQUENCY \t");
        for(int i=65;i<91;i++)
        {
            n=0;
            ch=(char)i;
            for(int j=0;j<l;j++)
            {
                c=a.charAt(j);
                if(c==ch||c==(ch+32))
                n=n+1;
            }
            if(n>0)            
            System.out.println("    "+ch+"\t\t     "+n);
        }
    }
}
    /**
                        VARIABLE DESCRIPTION
         
          Object        Class
          
            br       BufferedReader
            
          Variable      Datatype        Purpose
          
             n            int       accepting order of DDA
             l            int       storing length of string a
             i            int       looping
             j            int       looping
             a           String     accepting string
             c            char      extracting each character
             ch           char      storing each alphabet
          */
    /**
                ALGORITHM
                
         step 1 : accept a string a
         step 2 : perform l=s.length()
         step 3 : initialize i=65
         step 4 : initialize n=0
         step 5 : initialize ch=(char)i
         step 6 : initialize j=0
         step 7 : perform c=a.charAt(j)
         step 8 : if(c==ch||c==(ch+32)) returns true then increment n by 1
                  the given condition compares c and ch despite their case
         step 9 : increment j by 1
         step 10: repeat steps 6-10 while(j<l)
         step 11: if(n>0) then print the frequency n 
         step 12: increment i by 1
         step 13: repeat steps 3-12 while(i<91)
                    since 65-90 are the ASCII codes for A-Z
         step 14: exit
      */
         