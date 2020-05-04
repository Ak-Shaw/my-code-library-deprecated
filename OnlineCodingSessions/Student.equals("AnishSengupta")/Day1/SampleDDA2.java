public class SampleDDA2 {

	public static void main(String[] args) {
		
		int[][] a = {	
						{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9},
					};

		printDDA(a);
	}

	public static void printDDA(int[][] a) {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				System.out.print("\t"+a[i][j]);
			}

			System.out.println();
		}
	}
}