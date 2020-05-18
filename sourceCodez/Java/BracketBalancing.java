import java.util.*;

public class BracketBalancing{

    private static boolean isBalanced(String s){

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);

            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else if(c==')'||c=='}'||c==']'){

                if(stack.isEmpty()){
                    return false;
                }

                char c1=stack.pop();

                if((c1=='('&&c!=')')||(c1=='{'&&c!='}')||(c1=='['&&c!=']'))
                    return false;
            }
        }

        if(stack.isEmpty())
            return true;
        return false;

    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();

        System.out.println(isBalanced(s));


    }
}