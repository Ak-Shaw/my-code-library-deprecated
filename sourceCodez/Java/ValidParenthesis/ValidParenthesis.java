import java.io.*;
import java.util.*;

public class ValidParenthesis {
    // Implement your solution by completing the below function
    public boolean isValid(String s) {

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

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = in.readLine();
        boolean result = new ValidParenthesis().isValid(parenthesis);
        System.out.print(String.valueOf(result));
    }
}
