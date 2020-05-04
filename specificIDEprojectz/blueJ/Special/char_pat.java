/* Given a square matrix M[][] of order 'n'. 
 * The maximum value possible is 10
 * 
 * take 3 characters as input and display as follows
 * 
 * e.g.,
 *         size 4 and characters *,? and #
 *         
 *         # * * # 
 *         ? # # ? 
 *         ? # # ? 
 *         # * * # 
 *         
 *         size 5 and characters $,! and @
 *         
 *         @ $ $ $ @ 
 *         ! @ $ @ ! 
 *         ! ! @ ! ! 
 *         ! @ $ @ ! 
 *         @ $ $ $ @ 
 */
import java.io.*;
class char_pat
    {
        static void main()throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("ENTER SIZE :");
            int n,q,w,l,i,j;
            char c;
            String a,b;
            n=Integer.parseInt(br.readLine());
            if(n>10)
            System.out.println("SIZE OUT OF RANGE");
            else
            {
                System.out.println("FIRST CHARACTER :");
                a=br.readLine();// a=(char)System.in.read(); 
                System.out.println("SECOND CHARACTER :");
                b=br.readLine();
                System.out.println("THIRD CHARACTER :");
                c=(char)br.read();
                q=(n*2-3)/2;
                w=0;
                l=n/2;
                for(i=0;i<n;i++)
                {
                    for(j=0;j<w;j++)
                    System.out.print(b+" ");
                    System.out.print(c+" ");
                    for(j=0;j<q;j++)
                    System.out.print(a+" ");
                    if(i!=l)
                    System.out.print(c+" ");
                    if(i==l&&n%2==0)
                    System.out.print(c+" ");
                    for(j=0;j<w;j++)
                    System.out.print(b+" ");
                    if(n%2==0)
                    {
                        if(i<l-1)
                        {
                            q-=2;
                            w++;
                        }
                        else if(i>=l)
                        {
                            q+=2;
                            w--;
                        }
                    }
                    else
                    {
                        if(i<l)
                        {
                            q-=2;
                            w++;
                        }
                        else 
                        {
                            q+=2;
                            w--;
                        }
                    }
                    System.out.println();
                }
            }
        }
}