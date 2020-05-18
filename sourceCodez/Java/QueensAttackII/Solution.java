import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int qr = sc.nextInt();

		// translation
		qr = n - qr + 1;

		int qc = sc.nextInt();

		Position queenPos = new Position(qr, qc);

		ArrayList<Position> obstacles = new ArrayList<Position>();

		for (int i = 0; i < k; i++) {

			int x = sc.nextInt();

			//translation
			x = n - x + 1;

			int y = sc.nextInt();

			Position obstacle = new Position(x, y);

			if (!outOfBounds(obstacle, n)) {
				obstacles.add(obstacle);
			}
		}

		int attackCount = getAttackCount(n, queenPos, obstacles);

		System.out.println(attackCount);
	}

	public static int getAttackCount(int n, Position queenPos, ArrayList<Position> obstacles) {

		HashMap<Integer, Position> validObstacles = getValidObstacles(queenPos, obstacles);

		generateValidEndPoints(n, queenPos, validObstacles);

		HashMap<Integer, Position> endPoints = validObstacles;
		
		int attackCount = 0;

		for (int i = 1; i <= 8; i++) {

			attackCount += getDistanceInDir(queenPos, endPoints.get(i), i);
		}

		return attackCount;

	}

	public static int getDistanceInDir(Position queenPos, Position endPoint, int dir) {

		switch (dir) {

			case 1 : 

				return queenPos.getY() - endPoint.getY();

			case 2 : 

				return endPoint.getY() - queenPos.getY();

			case 3 :
			case 5 :
			case 7 : 

				return queenPos.getX() - endPoint.getX();

			case 4 : 
			case 6 :
			case 8 :

				return endPoint.getX() - queenPos.getX();
			
		}

		return 0;
	}

	// public static int getDistanceInDir1(Position queenPos, Position endPoint) {

	// 	return queenPos.getY() - endPoint.getY();
	// }

	// public static int getDistanceInDir2(Position queenPos, Position endPoint) {

	// 	return endPoint.getY() - queenPos.getY();
	// }

	// public static int getDistanceInDir3(Position queenPos, Position endPoint) {

	// 	return queenPos.getX() - endPoint.getX();
	// }

	// public static int getDistanceInDir4(Position queenPos, Position endPoint) {

	// 	return endPoint.getX() - queenPos.getX();
	// }

	// public static int getDistanceInDir5(Position queenPos, Position endPoint) {

	// 	return queenPos.getX() - endPoint.getX();
	// }

	// public static int getDistanceInDir6(Position queenPos, Position endPoint) {

	// 	return endPoint.getX() - queenPos.getX();
	// }

	// public static int getDistanceInDir7(Position queenPos, Position endPoint) {

	// 	return queenPos.getX() - endPoint.getX();
	// }

	// public static int getDistanceInDir8(Position queenPos, Position endPoint) {

	// 	return endPoint.getX() - queenPos.getX();
	// }

	public static void generateValidEndPoints(int n, Position queenPos, HashMap<Integer, Position> validObstacles) {

		for (int i = 1; i <= 8; i++) {

			if (!validObstacles.containsKey(i)) {

				validObstacles.put(i, endPointInDir(n, queenPos, i));
			
			} else {

				getCloserInDir(validObstacles.get(i), i);
			}

		}
	}

	public static Position endPointInDir(int n, Position queenPos, int dir) {

		switch (dir) {

			case 1 : return endPointInDir1(n, queenPos);
			case 2 : return endPointInDir2(n, queenPos);
			case 3 : return endPointInDir3(n, queenPos);
			case 4 : return endPointInDir4(n, queenPos);
			case 5 : return endPointInDir5(n, queenPos);
			case 6 : return endPointInDir6(n, queenPos);
			case 7 : return endPointInDir7(n, queenPos);
			case 8 : return endPointInDir8(n, queenPos);
			
		}

		return null;
	}

	public static void getCloserInDir(Position pos, int dir) {

		switch (dir) {

			case 1 : getCloserInDir1(pos); break;

			case 2 : getCloserInDir2(pos); break;

			case 3 : getCloserInDir3(pos); break;

			case 4 : getCloserInDir4(pos); break;

			case 5 : getCloserInDir5(pos); break;

			case 6 : getCloserInDir6(pos); break;

			case 7 : getCloserInDir7(pos); break;
 
			case 8 : getCloserInDir8(pos); break;
		}
	}

	public static void getCloserInDir1(Position pos) {
		pos.setY(pos.getY() + 1);
	}

	public static void getCloserInDir2(Position pos) {
		pos.setY(pos.getY() - 1);
	}

	public static void getCloserInDir3(Position pos) {
		pos.setX(pos.getX() + 1);
	}

	public static void getCloserInDir4(Position pos) {
		pos.setX(pos.getX() - 1);
	}

	public static void getCloserInDir5(Position pos) {
		pos.setX(pos.getX() + 1);
		pos.setY(pos.getY() + 1);
	}

	public static void getCloserInDir6(Position pos) {
		pos.setX(pos.getX() - 1);
		pos.setY(pos.getY() - 1);
	}

	public static void getCloserInDir7(Position pos) {
		pos.setX(pos.getX() + 1);
		pos.setY(pos.getY() - 1);
	}

	public static void getCloserInDir8(Position pos) {
		pos.setX(pos.getX() - 1);
		pos.setY(pos.getY() + 1);
	}

	public static Position endPointInDir1(int n, Position queenPos) {

		int x = queenPos.getX();
		int y = 1;

		return new Position(x, y);
	}

	public static Position endPointInDir2(int n, Position queenPos) {

		int x = queenPos.getX();
		int y = n;

		return new Position(x, y);
	}

	public static Position endPointInDir3(int n, Position queenPos) {

		int x = 1;
		int y = queenPos.getY();

		return new Position(x, y);
	}

	public static Position endPointInDir4(int n, Position queenPos) {

		int x = n;
		int y = queenPos.getY();

		return new Position(x, y);
	}

	public static Position endPointInDir5(int n, Position queenPos) {

		Position endPoint = null;

		int qx = queenPos.getX();
		int qy = queenPos.getY();

		Position queenPosCopy = new Position(queenPos.getX(), queenPos.getY());

		while (!outOfBounds(queenPosCopy, n)) {

			endPoint = queenPosCopy;

			qx--;
			qy--;

			queenPosCopy = new Position(qx, qy);
		}


		return endPoint;
	}

	public static Position endPointInDir6(int n, Position queenPos) {

		Position endPoint = null;

		int qx = queenPos.getX();
		int qy = queenPos.getY();

		Position queenPosCopy = new Position(queenPos.getX(), queenPos.getY());

		while (!outOfBounds(queenPosCopy, n)) {

			endPoint = queenPosCopy;

			qx++;
			qy++;

			queenPosCopy = new Position(qx, qy);
		}


		return endPoint;
	}

	public static Position endPointInDir7(int n, Position queenPos) {

		Position endPoint = null;

		int qx = queenPos.getX();
		int qy = queenPos.getY();

		Position queenPosCopy = new Position(queenPos.getX(), queenPos.getY());

		while (!outOfBounds(queenPosCopy, n)) {

			endPoint = queenPosCopy;

			qx--;
			qy++;

			queenPosCopy = new Position(qx, qy);
		}


		return endPoint;
	}

	public static Position endPointInDir8(int n, Position queenPos) {

		Position endPoint = null;

		int qx = queenPos.getX();
		int qy = queenPos.getY();

		Position queenPosCopy = new Position(queenPos.getX(), queenPos.getY());

		while (!outOfBounds(queenPosCopy, n)) {

			endPoint = queenPosCopy;

			qx++;
			qy--;

			queenPosCopy = new Position(qx, qy);
		}


		return endPoint;
	}

	public static HashMap<Integer, Position> getValidObstacles(Position queenPos, ArrayList<Position> obstacles) {

		HashMap<Integer, Position> validObstacles = new HashMap<Integer, Position>();

		for (Position obstacle : obstacles) {

			int obstacleDirection = getObstacleDirection(queenPos, obstacle);

			if (obstacleDirection == 0) {
				continue;
			}

			if (validObstacles.containsKey(obstacleDirection)) {

				obstacle = obstacleCloserToQueen(obstacle, validObstacles.get(obstacleDirection), obstacleDirection);
			}

			validObstacles.put(obstacleDirection, obstacle);
		}

		return validObstacles;
	}

	public static Position obstacleCloserToQueen(Position obstacle1, Position obstacle2, int obstacleDirection) {

		switch (obstacleDirection) {

			case 1 :

				return positionHavingGreaterColumnOrder(obstacle1, obstacle2);

			case 2 :

				return positionHavingLesserColumnOrder(obstacle1, obstacle2);

			case 3 :
			case 5 :
			case 7 :

				return positionHavingGreaterRowOrder(obstacle1, obstacle2);

			case 4 :
			case 6 :
			case 8 :

				return positionHavingLesserRowOrder(obstacle1, obstacle2);
			
		}

		return null;
	}

	public static Position positionHavingGreaterRowOrder(Position p1, Position p2) {

		int x1 = p1.getX();
		int x2 = p2.getX();

		return x1 > x2 ? p1 : p2;
	}

	public static Position positionHavingLesserRowOrder(Position p1, Position p2) {

		int x1 = p1.getX();
		int x2 = p2.getX();

		return x1 < x2 ? p1 : p2;
	}

	public static Position positionHavingGreaterColumnOrder(Position p1, Position p2) {

		int y1 = p1.getY();
		int y2 = p2.getY();

		return y1 > y2 ? p1 : p2;
	}

	public static Position positionHavingLesserColumnOrder(Position p1, Position p2) {

		int y1 = p1.getY();
		int y2 = p2.getY();

		return y1 < y2 ? p1 : p2;
	}


	// will return the direction of obstacle
	// 1 left
	// 2 right
	// 3 up
	// 4 down
	// 5 top-left
	// 6 bottom-right
	// 7 top-right
	// 8 bottom-left
	public static int getObstacleDirection(Position queenPos, Position obstacle) {

		int qx = queenPos.getX();
		int qy = queenPos.getY();

		int ox = obstacle.getX();
		int oy = obstacle.getY();

		if (pairLiesInSameRow(queenPos, obstacle)) {

			if (oy < qy) {
				return 1;
			} else {
				return 2;
			}
		}

		if (pairLiesInSameColumn(queenPos, obstacle)) {

			if (ox < qx) {
				return 3;
			} else {
				return 4;
			}
		}

		if (pairLiesInSameLeftDiagonal(queenPos, obstacle)) {

			if (ox < qx) {
				return 5;
			} else {
				return 6;
			}
		}

		if (pairLiesInSameRightDiagonal(queenPos, obstacle)) {

			if (ox < qx) {
				return 7;
			} else {
				return 8;
			}
		}

		return 0;
	}

	public static Boolean pairLiesInSameRow(Position p1, Position p2) {

		int x1 = p1.getX();
		// int y1 = p1.getY();

		int x2 = p2.getX();
		// int y2 = p2.getY();

		return x1 == x2;
	}

	public static Boolean pairLiesInSameColumn(Position p1, Position p2) {

		// int x1 = p1.getX();
		int y1 = p1.getY();

		// int x2 = p2.getX();
		int y2 = p2.getY();

		return y1 == y2;
	}

	public static Boolean pairLiesInSameLeftDiagonal(Position p1, Position p2) {

		int x1 = p1.getX();
		int y1 = p1.getY();

		int x2 = p2.getX();
		int y2 = p2.getY();

		return (x1 - y1) == (x2 - y2);
	}

	public static Boolean pairLiesInSameRightDiagonal(Position p1, Position p2) {

		int x1 = p1.getX();
		int y1 = p1.getY();

		int x2 = p2.getX();
		int y2 = p2.getY();

		return (x1 + y1) == (x2 + y2);
	}

	public static Boolean outOfBounds(Position position, int n) {

		int x = position.getX();
		int y = position.getY();

		if (x > 0 && y > 0 && x <= n && y <= n) {
			return false;
		}

		return true;
	}
}

class Position {

	private int x;
	private int y;

	Position(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public int getX() {

		return this.x;
	}

	public int getY() {

		return this.y;
	}

	public void setX(int x) {

		this.x = x;
	}

	public void setY(int y) {

		this.y = y;
	}

	public String toString() {

		return "[" + this.x + ", " + this.y + "]";
	}
}