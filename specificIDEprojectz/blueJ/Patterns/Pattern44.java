/*

# @ @ @ @ #
? # @ @ # ?
? ? # # ? ?
? # @ @ # ?
# @ @ @ @ #

*/

public class Pattern44{

	public static void main(String[] args) {
		
		int q=0,w=4;
		for(int i=0;i<5;i++){

			for(int j=0;j<q;j++)
				System.out.print("? ");

			System.out.print("# ");

			for(int j=0;j<w;j++)
				System.out.print("@ ");

			System.out.print("# ");

			for(int j=0;j<q;j++)
				System.out.print("? ");

			if(i<2){
				w-=2;
				q++;
			}
			else{
				w+=2;
				q--;
			}

			System.out.println();

		}
	}
}