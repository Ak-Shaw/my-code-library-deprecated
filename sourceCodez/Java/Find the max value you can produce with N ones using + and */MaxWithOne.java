import java.util.*;
public class MaxWithOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int n= sc.nextInt();
        System.out.println(maxWithOne(n));
    }
    static String maxWithOne(int n){

    	long res = 0l;

    	if (n <= 4) {
    		res = n;
    	} else {

    		int rem = n % 3;
    		int q = n / 3;

    		switch(rem) {
    			
    			case 0:
    			res = (long)Math.pow(3, q);
    			break;
    			
    			case 1:
    			res = (long)Math.pow(3, q - 1) * (3 + rem);
    			break;
    			
    			case 2:
    			res = (long)Math.pow(3, q - 1) * (4 + rem);
    			break;
    		}
    	}

    	return String.valueOf(res);
    }
}
