import java.io.*;
import java.util.*;

class StringToIntegerAtoi {
    // Implement your solution by completing the below function
    public int myAtoi(String str) {

        if(str.length() == 0)
            return 0;

        str=str.trim();

        String s="";
        int charactersAdded=0;

        for(int i=0; i<str.length(); i++){

            char c=str.charAt(i);

            if(c=='-' || c=='+' || (c>=48 && c<=57)){

                s+=c;

                charactersAdded++;
            }
        }

        if(charactersAdded==0)
            return 0;

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        int result = new StringToIntegerAtoi().myAtoi(str);
        System.out.println(result);
    }
}
