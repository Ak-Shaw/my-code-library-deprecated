import java.util.Scanner;
public class Cipher
{
    String text;
    int L;
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT :");
        text = in.nextLine();
        L = text.length();
        if(!(L>3 && L<100))
        {
            System.out.println("INVALID LENGTH");
            System.exit(0);
        }
    }
    //rotate-shifts the original character by the key amount
    char Encrypt(char original, int key)
    {
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        original = Character.toUpperCase(original);
        if(alphabets.indexOf(original)==-1)
        {
            return original;
        }      
        //if the value overshoots 26, the mod operator makes it wrap around
        int shifted = ((alphabets.indexOf(original)+key)%26);
        return alphabets.charAt(shifted);
    }
    public static void main(String args[])
    {
        Cipher ob = new Cipher();
       
        ob.input();
        int key = 13;
       
        System.out.println("The cipher text is:");
        for(int i=0 ; i<ob.L ; i++)
        {
            char ch = ob.text.charAt(i);
            if(Character.isLowerCase(ch))
            {
                System.out.print(Character.toLowerCase(ob.Encrypt(ch,key)));
            }
            else
            {
                System.out.print(ob.Encrypt(ch,key));
            }
        }        
    }
}