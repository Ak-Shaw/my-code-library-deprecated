import java.io.*;
public class PalinW
    {
        public static void main()throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a sentence:");
            String s=br.readLine()+" ",ns="",nw="";           
            int l=s.length(),c=0,i;
            char b;
            System.out.println("Palindrome Words are :");
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
            System.out.println("No Palindrome words");
        }
    }