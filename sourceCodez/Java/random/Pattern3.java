import java.util.*;

public class Pattern3{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int l=sc.nextInt();

		int x=0;
		int c=0;

		while(x<=l-2){
			c=1;
			while(c<l-x){

				System.out.println(x+" "+(x+c));

				c++;
			}

			x++;

		}
	}
}