//Program for Infix to Prefix conversion

import java.util.Stack;

import java.util.*;

class inf_pre

{

  public static String convert(String exp)

    {  

        String pfix= new String ("");

        Stack<Character> st=new Stack<>(); //creating a stack

        for (int i = 0; i<exp.length(); ++i)

        {

            char c = exp.charAt(i); //extracting the characters of given expression

             

            if(Character.isLetterOrDigit(c)) //if the character is operand,add it directly in postfix exp

            pfix=pfix +c;

            else if(c=='(')

            st.push(c);

            else if (c==')') //if a right parenthesis is encountered,pop the elements of stack till a left parenthesis is encountered

            {

                while(!st.isEmpty()&& st.peek()!='(')

                pfix +=st.pop();

                 if (!st.isEmpty() && st.peek() != '(')

                    return "Invalid Expression"; // invalid expression                

                else

                    st.pop();

                }

            else{

            while(!st.isEmpty() && precedence(c)<=precedence(st.peek()))

            //if the character is operator,compare its precedence with top element of stack and push it in stack

                 pfix +=st.pop();

                 st.push(c);

                }

            }

            while(!st.isEmpty()) //pop all the stack elements

            pfix=pfix + st.pop();

            return pfix;

        }

        public static int precedence(char x) //method for checking precedence of operators

        {

        switch(x)

        {

            case '^': return 3;

            case '*': return 2;

            case '/': return 2;

            case '+': return 1;

            case '-': return 1;

        }

        return -1;

    }

    public static String bracI(String s)
    {
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
                
                //if(i1==0||e.charAt(i2-1)!=41)
                if(i1==0||e.charAt(i1-1)!=40)
                {
                    e.insert(i1,'(');
                    e.insert(i2,')');
                }
            }
        }
        return(e.toString());
    }
   

    public static void main(String args[])

    {

       String E;

       Scanner sc =new Scanner(System.in);//taking infix expression as input
System.out.println("expression :\n\n");
       E=sc.nextLine();
       E=bracI(E);//method which inserts brackets where required
       String E1="";
       char c;
       for(int i=0;i<E.length();c=E.charAt(i),E1=c+E1,i++);
       String E2="";
       for(int i=0;i<E.length();i++)
       {
           c=E1.charAt(i);
           if((int)c==40)
           c++;
           else if((int)c==41)
           c--;
           E2+=c;
        }
        
       
       String fe1=convert(E2);
       String fe="";
       for(int i=0;i<fe1.length();c=fe1.charAt(i),fe=c+fe,i++);
       System.out.println("Prefix expression: "+fe);

    }
}

