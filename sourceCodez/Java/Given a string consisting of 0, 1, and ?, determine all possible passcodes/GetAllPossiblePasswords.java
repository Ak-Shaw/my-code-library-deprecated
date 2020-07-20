import java.util.*;

public class GetAllPossiblePasswords {
    
    static List<String> getAllPossiblePasswords(String s){

        List<String> result = new ArrayList<>();

        populateResultWithPossiblePasswords(s, 0, s.length(), result, "");

        return result;
    }

    static void populateResultWithPossiblePasswords(String s, int i, int l, List<String> result, String temp) {

        if (i == l) {
            result.add(temp);
        
        } else {

            char c = s.charAt(i);

            if (c == '?') {
                populateResultWithPossiblePasswords(s, i + 1, l, result, temp + '0');
                populateResultWithPossiblePasswords(s, i + 1, l, result, temp + '1');
            
            } else {
                populateResultWithPossiblePasswords(s, i + 1, l, result, temp + c);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> result = getAllPossiblePasswords(s);
        for (String password : result) {
            System.out.println(password);
        }        
    }
}