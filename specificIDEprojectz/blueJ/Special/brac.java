import java.util.Stack;

import java.util.*;

class brac

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

    public static String putbrc(String x) //method for putting braces using postfix exp

    {

    char k;

    Stack<String> oprands = new Stack<String>();

     for (int i = 0; i < x.length(); i++) 

    {

        k=x.charAt(i);

     if (Character.isLetterOrDigit(k))

     {

          oprands.push(k+"");

        }

        else{

             String op1 = oprands.peek();

                oprands.pop();

 

                String op2 = oprands.peek();

                oprands.pop();

                

                String tmp = '('+ op2 + k + op1 +')';

                oprands.push(tmp);

            }

        }

        return (oprands.peek());

    }

   

     public static void main(String args[])

   {

       String E,ex="";

       Scanner sc =new Scanner(System.in);//taking infix expression as input
       System.out.println("expression :\n\n");

       E=sc.nextLine();

       ex=convert(E);

       System.out.println("New expression: "+ putbrc(ex));

    }

}

