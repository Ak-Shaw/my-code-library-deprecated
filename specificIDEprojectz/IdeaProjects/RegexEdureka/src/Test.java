import java.util.regex.*;

public class Test {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[A-Z]{0,3}");
        Matcher matcher = pattern.matcher("AB");
        System.out.println("Pattern match result - " + matcher.matches());

    }
}
