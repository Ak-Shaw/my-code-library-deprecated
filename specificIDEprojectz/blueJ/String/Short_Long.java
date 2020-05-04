/*
Question:
Write a program to find the shortest and the longest word in a sentence and print them along with their length.
Sample Input: I am learning Java
Sample Output:
Shortest word = I
Length = 1
Longest word = learning
Length = 8
Solution:
Short_long_word 
Java
*/
/**
* The class Short_long_word finds and displays the shortest and the longest word in a sentence along with their lengths
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/
import java.io.*;
class Short_Long
{
public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any sentence : "); //inputting the sentence
        String s=br.readLine();
        s=s+" "; //adding a space at the end, to extract the last word also
        int len=s.length(); //finding the length of the sentence
        String x="",maxw="",minw="";
        char ch;
        int p,maxl=0,minl=len;
        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i); //extracting characters of the string one at a time
            if(ch!=' ')
            {
                x=x+ch; //adding characters to form word if character is not space
            }
            else
            {
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
                x=""; //emptying the temporary variable to store next word
            }
        }
        System.out.println("Shortest word = "+minw+"\nLength = "+minl);
        System.out.println("Longest word = "+maxw+"\nLength = "+maxl);
    }
}
/**
Output:
Enter any sentence : I am learning Java
Shortest word = I
Length = 1
Longest word = learning
Length = 8
Working Principle:
In the above program, we have declared 3 String variables, ‘x’ for storing each word of a sentence temporarily, ‘minw’ for storing the shortest word and ‘maxw’ for storing the longest word.
Similarly, we have defined 3 integer variables, ‘p’ for storing the length of the temporary word stored in ‘x’, and initialized ‘minl’ with the length of the original string and ‘maxl’ with 0.
Note: We have not initialized ‘minl’ with 0 because whatever be the word in the sentence, its length will always be greater than 0, hence we will not get the shortest word.
The technique used for taking out words from the sentence one at a time is that we extract all characters one by one and add them to a temporary String variable ‘x’ until we get a space.
Once we get a space, we know that a word has ended.
Note: Since we know that when we encounter a space, a word has ended, so to implement this concept we added a space at the end of the original string, otherwise the last word will not be extracted.
In the for loop, we are extracting one characetr at a time and storing it in a character variable ‘ch’.
In this loop we check whether this character is a space or not. If we dont get a space, the if block executes and the character is added to the temporary variable ‘x’.
As soon as we get a space, we have got a word, and hence the control goes to the else block, where we find the length of that word.
Then we compare whether the length of this word is less than the value stored in the variable ‘minl’. If it is so, then that length is transferred to the variable ‘minl’ and the corresponding word ‘x’ is transferred to the variable ‘minw’.
Similarly, we compare whether the length of this word is greater than the value stored in the variable ‘maxl’. If it is so, then that length is transferred to the variable ‘maxl’ and the corresponding word ‘x’ is transferred to the variable ‘maxw’.
In the end, we are emptying the temporary String variable ‘x’ in order to make it ready to accept the next word.
Finally we are printing the shortest and the longest word in the sentence along with their lengths.
*/


