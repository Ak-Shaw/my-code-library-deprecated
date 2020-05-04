public class Pattern1 {

	public static void main(String[] args) {
		
		pat(1, 1);
	}

	static void pat(int i, int j){

		if(i==6)
			return;

		if(j<=i){
			System.out.print("\t"+j);
			pat(i, j+1);
		}

		if(j>i){
			System.out.println();
			pat(i+1, 1);
		}
	}
}