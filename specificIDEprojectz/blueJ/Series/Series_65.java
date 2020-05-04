/*
 * 2a! - 6a!/4 + 12a!/9 - 20a!/61 +..... to n terms
 
   fact() -> factorial of a
   rev()  -> reverse value of square
   */

  public class Series_65
  {
      public static void main(int n,int a)
      {
          Series_65 ob=new Series_65();
          int i,r,f=ob.fact(a);
          double s=0,b;
          for(i=1;i<=n;i++)
          {
              r=ob.rev(i*i);
              b=(i*(i+1)*f)/r;
              if(i%2==0)
              b=-b;
              s+=b;
            }
            System.out.println("Sum of the series = "+s);
        }
        int fact(int a)
        {
            int f=1;
            for(int i=2;i<=a;i++)
            f*=a;
            return (f);
        }
        int rev(int q)
        {
            int s=0,d;
            while(q!=0)
            {
                d=q%10;
                s=s*10+d;
                q/=10;
            }
            return(s);
        }
    }
