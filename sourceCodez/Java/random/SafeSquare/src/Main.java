// Utility Class - created for testing

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		solution so = new solution();
		so.readInput();

		System.out.println(so.move());

		printCharDDA_indexed_1(so);
		printIntDDA_indexed_1(so);
	}

	// public static void main(String[] args) {
		
	// 	solution so=new solution();
	// 	so.readInput();

		
	// 	System.out.println("printCharDDA_indexed_1\n");
	// 	printCharDDA_indexed_1(so);

	// 	so.detectPieces();

	// 	checkDetectPieces(so);

	// 	so.moveSpecial();

	// 	System.out.println("moveSpecial()");
	// 	printCharDDA_indexed_1(so);
	// 	printIntDDA_indexed_1(so);

	// 	System.out.println("countSafeSquares() : " + so.countSafeSquares());
	// }

	// public static void main(String[] args) {
		
	// 	int n = 5, m = 8;

	// 	LayerMatrix layerMatrix = new LayerMatrix(n, m);

	// 	int[][] layerMat = layerMatrix.getLayerMatrix();

	// 	System.out.println("layerMatrix of order " + n + " X " + m + " :");
	// 	for (int i = 1; i <= n; i++) {
			
	// 		for(int j = 1; j<= m; j++) {
	// 			System.out.print("\t" + layerMat[i][j]);
	// 		}

	// 		System.out.println();
	// 	}

	// 	ArrayList<ArrayList<Position>> layerWisePositionsComplete = layerMatrix.getLayerWisePositionsComplete();

	// 	System.out.println("layerWisePositionsComplete");

	// 	for (int i = 0; i < layerWisePositionsComplete.size(); i++) {

	// 		System.out.println("Layer " + (i + 1) + " :");

	// 		ArrayList<Position> layerWisePositions = layerWisePositionsComplete.get(i);

	// 		for (int j = 0; j < layerWisePositions.size(); j++) {

	// 			System.out.println(layerWisePositions.get(j));
	// 		}
	// 	}

	// 	System.out.println("detectLayer()");
	// 	System.out.println(layerMatrix.detectLayer(new Position(5, 5)));
	// }

	public static void printCharDDA_indexed_1(solution so) {

		char[][] matrix = so.matrix;
		int n = so.n;
		int m = so.m;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= m; j++) {

				System.out.print("\t"+matrix[i][j]);
			}

			System.out.println();
		}
	}

	public static void printIntDDA_indexed_1(solution so) {

		int[][] mat = so.mat;
		int n = so.n;
		int m = so.m;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= m; j++) {

				System.out.print("\t"+mat[i][j]);
			}

			System.out.println();
		}
	}

	public static void checkDetectPieces(solution so) {

		System.out.println("checkDetectPieces\n");

		System.out.println("printIntDDA_indexed_1\n");
		printIntDDA_indexed_1(so);

		System.out.println("printPositionsOfAllPieces\n");
		printPositionsOfAllPieces(so);

	}

	public static void printPositionsOfAllPieces(solution so) {

		ArrayList<Position> rooks = so.rooks;
		ArrayList<Position> bishops = so.bishops;
		ArrayList<Position> queens = so.queens;
		ArrayList<Position> knights = so.knights;
		ArrayList<Position> specials = so.specials;

		System.out.println("rooks");
		printPositions(rooks);

		System.out.println("bishops");
		printPositions(bishops);

		System.out.println("queens");
		printPositions(queens);

		System.out.println("knights");
		printPositions(knights);

		System.out.println("specials");
		printPositions(specials);
	}

	public static void printPositions(ArrayList<Position> positions) {

		for (Position position : positions) {

			System.out.println(position);
		}
	}
}