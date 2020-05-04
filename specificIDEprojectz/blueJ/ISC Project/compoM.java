import java.util.*;
class compoM
    {
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            int m,n,c=0,i,j,s,p,d,l=0;
            System.out.println("Enter starting and ending position");
            m=sc.nextInt();
            n=sc.nextInt();
            System.out.println("The composite magic numbers are :");
            for(j=m;j<=n;j++)
            {
                for(i=1;i<=j;i++)
                {
                    if(j%i==0)
                    c++;
                }
                p=j;
                while(p>9)
                {
                    m=p;
                    p=0;
                    while(m!=0)
                    {
                        d=m%10;
                        p=p+d;
                        m/=10;
                    }
                }
                if(p==1&&c>2)
                {
                    System.out.print(j+" ");
                    l++;
                }
                c=0;
            }
            if(l==0)
            System.out.println("No composite magic numbers present within given range");
            else
            System.out.println("\nFrequency of composite magic numbers :"+l);
        }
}
/**
 * 
   ALGORITHM
   
   step 1: accept m and n
   step 2: repeat steps 3- under loop for(j=m;j<=n;j++)
   step 3: count number of factors
   for(i=1;i<=j;i++)
                {
                    if(j%i==0)
                    c++;
                }
   step 4: initialize p=j and store the value of consecutive 
           addition of digits till it comes to a single digit and
           store it in p
           while(p>9)
                {
                    m=p;
                    p=0;
                    while(m!=0)
                    {
                        d=m%10;
                        p=p+d;
                        m/=10;
                    }
                }
   
    step 5: check whether j is a composite magic number
    if(p==1&&c>2) if the condition is satisfied print j
    step 6: count the frequency in l
    step 7:
    if(l==0)
            System.out.println("No composite magic numbers present within given range");
            else
            System.out.println("\nFrequency of composite magic numbers :"+l);
        
 */