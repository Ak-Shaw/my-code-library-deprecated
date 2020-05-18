import java.util.*;
import java.lang.Math;

class solution{
	char matrix[][]= new char[101][101];
	int mat[][]= new int[101][101];
	int n,m;
	Scanner inp= new Scanner(System.in);

	// Each of the ArrayList<Position> objects will 
	// store the positions the respective pieces 
	// as received in the input. 
	ArrayList<Position> rooks = new ArrayList<Position>();
	ArrayList<Position> bishops = new ArrayList<Position>();
	ArrayList<Position> queens = new ArrayList<Position>();
	ArrayList<Position> knights = new ArrayList<Position>();
	ArrayList<Position> specials = new ArrayList<Position>();

	public void readInput()
	{
		int i,j;
		n=inp.nextInt();
		m=inp.nextInt();
		for(i=1;i<=n;i++)
		{
			String s=inp.next();
			for(j=1;j<=m;j++)
			{
				matrix[i][j]=s.charAt(j-1);
			}
		}
	}
	public void readInputTest(char testRead[][],int row,int col)
	{
		n=row;
		m=col;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				matrix[i][j]=testRead[i-1][j-1];
			}
		}
	}

    // Input:
    //   1) chess board matrix
    // Task:
    //   1) Implement Rook move
    //   2) Implement Bishop move
    //   3) Implement Queens move
    //   4) Implement knight's move
    //   5) Special move
    // Output:
    //   Count the number of safe square and return it

    public int move()
	{
		detectPieces();

		moveRook();
		moveBishop();
		moveQueen();
		moveKnight();
		moveSpecial();

		return countSafeSquares();
	}

	// Traverses through the entire board 
	// while detecting and storing the positions 
	// of the pieces in their respective 
	// ArrayLists.
	public void detectPieces() {

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= m; j++) {

				switch (matrix[i][j]) {

					case 'R': 

						mat[i][j] = 1; 
						rooks.add(new Position(i, j));
						break;

					case 'B': 

						mat[i][j] = 1; 
						bishops.add(new Position(i, j));
						break;

					case 'Q': 

						mat[i][j] = 1; 
						queens.add(new Position(i, j));
						break;

					case 'K': 

						mat[i][j] = 1; 
						knights.add(new Position(i, j));
						break;

					case 'S': 

						mat[i][j] = 1; 
						specials.add(new Position(i, j));
						break;
				}
			}
		}
	}

	public Boolean outOfBounds(Position position) {

		int x = position.getX();
		int y = position.getY();

		if (x > 0 && y > 0 && x <= n && y <= m) {
			return false;
		}

		return true;
	}

	public Boolean isReserved(Position position) {

		int x = position.getX();
		int y = position.getY();

		if (matrix[x][y] == '.' || matrix[x][y] == 'X') {
			return false;
		}

		return true;
	}

	public void placeCross(Position position) {

		int x = position.getX();
		int y = position.getY();

		matrix[x][y] = 'X';
		mat[x][y] = 1;
	}

	public void moveRook() {

		for (Position position : rooks) {

			moveLeft(position);
			moveRight(position);
			moveUp(position);
			moveDown(position);
		}
	}

	public void moveLeft(Position position) {

		int x = position.getX();
		int y = position.getY();

		while (true) {

			y--;

			Position newPosition = new Position(x, y);

			if (outOfBounds(newPosition)) {
				break;
			}

			if (isReserved(newPosition)) {
				break;
			}

			placeCross(newPosition);

		} 
	}

	public void moveRight(Position position) {

		int x = position.getX();
		int y = position.getY();

		while (true) {

			y++;

			Position newPosition = new Position(x, y);

			if (outOfBounds(newPosition)) {
				break;
			}

			if (isReserved(newPosition)) {
				break;
			}

			placeCross(newPosition);

		} 
	}

	public void moveUp(Position position) {

		int x = position.getX();
		int y = position.getY();

		while (true) {

			x--;

			Position newPosition = new Position(x, y);

			if (outOfBounds(newPosition)) {
				break;
			}

			if (isReserved(newPosition)) {
				break;
			}

			placeCross(newPosition);

		} 
	}

	public void moveDown(Position position) {

		int x = position.getX();
		int y = position.getY();

		while (true) {

			x++;

			Position newPosition = new Position(x, y);

			if (outOfBounds(newPosition)) {
				break;
			}

			if (isReserved(newPosition)) {
				break;
			}

			placeCross(newPosition);

		} 
	}

	public void moveBishop() {

		for (Position position : bishops) {

			moveTopLeft(position);
			moveTopRight(position);
			moveDownLeft(position);
			moveDownRight(position);
		}
	}

	public void moveTopLeft(Position position) {

		int x = position.getX();
		int y = position.getY();

		while (true) {

			x--;
			y--;

			Position newPosition = new Position(x, y);

			if (outOfBounds(newPosition)) {
				break;
			}

			if (isReserved(newPosition)) {
				break;
			}

			placeCross(newPosition);

		} 
	}

	public void moveTopRight(Position position) {

		int x = position.getX();
		int y = position.getY();

		while (true) {

			x--;
			y++;

			Position newPosition = new Position(x, y);

			if (outOfBounds(newPosition)) {
				break;
			}

			if (isReserved(newPosition)) {
				break;
			}

			placeCross(newPosition);

		} 
	}

	public void moveDownLeft(Position position) {

		int x = position.getX();
		int y = position.getY();

		while (true) {

			x++;
			y--;

			Position newPosition = new Position(x, y);

			if (outOfBounds(newPosition)) {
				break;
			}

			if (isReserved(newPosition)) {
				break;
			}

			placeCross(newPosition);

		} 
	}

	public void moveDownRight(Position position) {

		int x = position.getX();
		int y = position.getY();

		while (true) {

			x++;
			y++;

			Position newPosition = new Position(x, y);

			if (outOfBounds(newPosition)) {
				break;
			}

			if (isReserved(newPosition)) {
				break;
			}

			placeCross(newPosition);

		} 
	}

	public void moveQueen() {

		for (Position position : queens) {

			moveLeft(position);
			moveRight(position);
			moveUp(position);
			moveDown(position);

			moveTopLeft(position);
			moveTopRight(position);
			moveDownLeft(position);
			moveDownRight(position);
		}
	}

	public void moveKnight() {

		for (Position position : knights) {

			moveToPossibleKnightPositions(position);
		}
	}

	public void moveToPossibleKnightPositions(Position position) {

		int x = position.getX();
		int y = position.getY();

		ArrayList<Position> possibleMoves = new ArrayList<Position>();

		// Knight has 8 possible moves.
		possibleMoves.add(new Position(x - 2, y - 1));
		possibleMoves.add(new Position(x - 2, y + 1));
		possibleMoves.add(new Position(x + 2, y - 1));
		possibleMoves.add(new Position(x + 2, y + 1));
		possibleMoves.add(new Position(x - 1, y - 2));
		possibleMoves.add(new Position(x + 1, y - 2));
		possibleMoves.add(new Position(x - 1, y + 2));
		possibleMoves.add(new Position(x + 1, y + 2));

		for (Position possibleMove : possibleMoves) {

			if (outOfBounds(possibleMove)) {
				continue;
			}

			if (isReserved(possibleMove)) {
				continue;
			}

			placeCross(possibleMove);
		}
	}

	public void moveSpecial() {

		if (specials.isEmpty()) {
			return;
		}

		LayerMatrix layerMatrix = new LayerMatrix(n, m);

		for (Position position : specials) {

			moveSpecialPiece(position, layerMatrix);
		}

	}

	public void moveSpecialPiece(Position position, LayerMatrix layerMatrix) {

		// Detecting layer in which our special piece lies.
		int layer = layerMatrix.detectLayer(position);

		// Extracting all the possible moves, i.e., all the 
		// squares of that layer. 
		ArrayList<Position> possibleMoves = layerMatrix.getLayerWisePositionsComplete().get(layer - 1);

		for (Position possibleMove : possibleMoves) {

			if (isReserved(possibleMove)) {
				continue;
			}

			placeCross(possibleMove);
		}
	}

	// All the unsafe zones and reserved squares 
	// are marked as 1. 
	// The safe squares are marked by 0.
	public int countSafeSquares() {

		int safeSquares = 0;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= m; j++) {

				if (mat[i][j] == 0) {
					safeSquares++;
				}
			}
		}

		return safeSquares;
	}
}
