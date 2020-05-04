
//infix to prefix (valid only when there is no bracket in exp)
/**NOT WORKING*/
 

import java.util.Stack;

import java.util.*;

class prefix

{

  public static String convert(String exp)

    {   String str="";

        String pfix= new String ("");

        Stack<Character> st=new Stack<>(); //creating a stack

        for (int i = 0; i<exp.length(); ++i)

        {

            char c = exp.charAt(i); //extracting the characters of given expression

             

            if(Character.isLetterOrDigit(c)) //if the character is operand,add it directly in postfix exp

            pfix = pfix + c;

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

           

             for (int j =pfix.length()-1;j>=0;--j)

             str=str+pfix.charAt(j);

            return str;

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

    static char check( char x){

        if(x==')')

        {

            x='(';

        }

        if(x=='(')

        {

            x=')';

        }

            return x;

        } 

    

     public static void main(String args[])

   {

       String E,s="",str="";

       char k;

       Scanner sc =new Scanner(System.in);//taking infix expression as input
System.out.println("expression :\n\n");
       E=sc.nextLine();

        for (int i =E.length()-1;i>=0;--i){

            k=E.charAt(i);

           k=check(k);

        s=s+k;

    }System.out.println(s);

       System.out.println("Prefix expression: "+ convert(s));

    }

}

  