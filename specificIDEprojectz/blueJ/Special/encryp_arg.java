/* the encryption of alphabets are to be done as follows :
 * 
 * A=1
 * B=2
 * C=3
 * .
 * .
 * .
 * Z=26
 * 
 * the potential of a word is found by adding the encrypted 
 * value of the alphabets.
 * 
 * Example : KITE
 * Potential = 11+9+20+5=45
 * 
 * Accept a sentence which is terminated by either ".","?","!". Each
 * word of sentence is separated by single space. Decode the words 
 * according to their potential and arrange them in ascending order.
 * 
 */
import java.util.*;
class encryp_arg
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT :");
        String s=sc.nextLine(),t="";
        int i,j,k=0,q=0;
        char c;
        int b[]=new int[20];
        String a[]=new String[20];
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c=='.'||c=='?'||c=='!'||c==' ')
            {
                a[k]=t;
                b[k++]=q;
                t="";
                q=0;
            }
            else
            {
                t+=c;
                q+=(int)c-64;
            }
        }
        System.out.println("POTENTIAL :\n");
        for(i=0;i<k;i++)
        System.out.println(a[i]+" ="+b[i]);
        for(i=0;i<k-1;i++)
        {
            for(j=0;j<k-1-i;j++)
            {
                if(b[j]>b[j+1])
                {
                    q=b[j];
                    b[j]=b[j+1];
                    b[j+1]=q;
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.print("\nOUTPUT :");
        for(i=0;i<k;i++)
        System.out.print(a[i]+" ");
    }
}