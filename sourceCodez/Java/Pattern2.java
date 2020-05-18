public class Pattern2{

	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);

		printPat(n);
	}

	static void printPat(int n){

		for(int i = 0; i < (int)Math.pow(4, n); i++){

			int j = i;

			String s = "";

			while(j>0){
				 
				int c = j % 4;
				s = c + s;
				j /= 4;
			}

			if(i==0)
				s="0";

			int l = s.length();

			for(int k = 0; k < n - l; k++){
				s=0+s;
			}

			System.out.println(s);

		}
	}
}