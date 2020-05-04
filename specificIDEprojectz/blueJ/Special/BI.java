//bracket insertion
import java.util.*;
public class BI
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("expression :\n\n");
        String s=sc.next();
        StringBuffer e=new StringBuffer(s);
        char c,c1,c2,b;
        int i1=-1,i2=-1;//insertion indices
        int i,j,k,l;
        char o[][]={{'^','^'},{'*','/'},{'+','-'}};
        for(l=0;l<3;l++)
        for(i=0;i<e.length();i++)
        {
            c=e.charAt(i);
            if(c==o[l][0]||c==o[l][1])
            {
                c1=e.charAt(i-1);
                c2=e.charAt(i+1);

                if((int)c1!=41&&(int)c2!=40)
                {
                    i1=i-1;
                    i2=i+3;
                }
                else if((int)c1==41&&(int)c2!=40)
                {
                    j=0;
                    k=i;
                    while(k>=0)
                    {
                        k--;
                        b=e.charAt(k);
                        if((int)b==41)
                            j--;
                        else if((int)b==40)
                            j++;
                        if(j==0)
                            break;
                    }
                    i1=k;
                    i2=i+3;
                }
                else if((int)c1!=41&&(int)c2==40)
                {
                    j=0;
                    k=i;
                    while(k<e.length())
                    {
                        k++;
                        b=e.charAt(k);
                        if((int)b==40)
                            j--;
                        else if((int)b==41)
                            j++;
                        if(j==0)
                            break;
                    }
                    i1=i-1;
                    i2=k+2;
                }
                else
                {
                    j=0;
                    k=i;
                    while(k>=0)
                    {
                        k--;
                        b=e.charAt(k);
                        if((int)b==41)
                            j--;
                        else if((int)b==40)
                            j++;
                        if(j==0)
                            break;
                    }
                    i1=k;
                    j=0;
                    k=i;
                    while(k<e.length())
                    {
                        k++;
                        b=e.charAt(k);
                        if((int)b==40)
                            j--;
                        else if((int)b==41)
                            j++;
                        if(j==0)
                            break;
                    }
                    i2=k+2;
                }
                //if(i1==0||e.charAt(i2-1)!=41)
                if(i1==0||e.charAt(i1-1)!=40)
                {
                    e.insert(i1,'(');
                    e.insert(i2,')');
                }
            }
        }
        System.out.println("\n\nexpression after inserting necessary brackets :\n");
        System.out.println("\n\n"+e.toString());
    }
}