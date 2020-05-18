// Utility for monitoring special piece movements.

import java.util.*;

public class LayerMatrix {

	private int n;
	private int m;
	private int[][] layerMatrix;

	// Will contain ArrayLists of positions of all positions of a particular layer.
	private ArrayList<ArrayList<Position>> layerWisePositionsComplete;

	LayerMatrix(int n, int m) {

		this.n = n;
		this.m = m;

		layerWisePositionsComplete = new ArrayList<ArrayList<Position>>();

		createLayerMatrix();
	}

	// Creates layer matrix by using spiral matrix approach.
	public void createLayerMatrix() {

		layerMatrix = new int[n + 1][m + 1];

		Position currentPosition = new Position(1, 0);

		int noOfElements = n * m;
		int noOfElementsTraversed = 0;
		int dir = -1;
		int lastDir = -1;

		Position nextPosition = null;

		ArrayList<Position> layerWisePositions = new ArrayList<Position>();

		int layerValue = 1;

		while (allElementsHaveNotBeenTraversed(noOfElements, noOfElementsTraversed)) {

			dir = (dir + 1) % 4;

			// If the direction changes from "up" to "right", 
			// it means that the traversal of one layer is complete 
			// and we need to add the collected positions of that layer, 
			// i.e., "layerWisePositions" to the ArrayList "layerWisePositionsCommplete". 
			// After doing so, we need to create a new object of ArrayList<Position> 
			// to store positions of next layer. 
			if (lastDir == 3 && dir == 0) {

				layerWisePositionsComplete.add(layerWisePositions);

				layerWisePositions = new ArrayList<Position>();

				layerValue++;
			}

			while (notReachedRoadblock(currentPosition, dir)) {

				switch (dir) {

					case 0:

						nextPosition = moveRight(currentPosition);
						break;

					case 1:

						nextPosition = moveDown(currentPosition);
						break;

					case 2:

						nextPosition = moveLeft(currentPosition);
						break;

					case 3:

						nextPosition = moveUp(currentPosition);
						break;

				}

				layerWisePositions.add(nextPosition);
				updateCurrentPosition(currentPosition, dir);
				placeLayerValue(currentPosition, layerValue);
				noOfElementsTraversed++;
				lastDir = dir;

			}
		}

		// Adding last ArrayList created.
		layerWisePositionsComplete.add(layerWisePositions);
	}

	public ArrayList<ArrayList<Position>> getLayerWisePositionsComplete() {

		return layerWisePositionsComplete;
	}

	public int[][] getLayerMatrix() {
		return layerMatrix;
	}

	private void placeLayerValue(Position currentPosition, int layerValue) {

		getLayerMatrix()[currentPosition.getX()][currentPosition.getY()] = layerValue;
	}

	private void updateCurrentPosition(Position currentPosition, int dir) {

		switch (dir) {

			case 0:

				currentPosition.setY(currentPosition.getY() + 1);
				break;

			case 1:

				currentPosition.setX(currentPosition.getX() + 1);
				break;

			case 2:

				currentPosition.setY(currentPosition.getY() - 1);
				break;

			case 3:

				currentPosition.setX(currentPosition.getX() - 1);
				break;
			
		}

	}

	private Boolean allElementsHaveNotBeenTraversed(int noOfElements, int noOfElementsTraversed) {

        if (noOfElementsTraversed<noOfElements) {
            return true;
        }
    
        return false;
    }

    private Boolean notReachedRoadblock(Position currentPosition, int dir) {

    	int x = currentPosition.getX();
    	int y = currentPosition.getY();

    	switch (dir) {

    		case 0:

    			y++;
    			break;

    		case 1:

    			x++;
    			break;

    		case 2:

    			y--;
    			break;

    		case 3:

    			x--;
    			break;
    	}

    	Position newPosition = new Position(x, y);

    	if (outOfBounds(newPosition)) {
    		return false;
    	}

    	if (getLayerMatrix()[x][y] > 0) {
    		return false;
    	}

    	return true;
    }

    public Boolean outOfBounds(Position position) {

		int x = position.getX();
		int y = position.getY();

		if (x > 0 && y > 0 && x <= n && y <= m) {
			return false;
		}

		return true;
	}

	private Position moveRight(Position currentPosition) {

		return new Position(currentPosition.getX(), currentPosition.getY() + 1);
	}

	private Position moveDown(Position currentPosition) {

		return new Position(currentPosition.getX() + 1, currentPosition.getY());
	}

	private Position moveLeft(Position currentPosition) {

		return new Position(currentPosition.getX(), currentPosition.getY() - 1);
	}

	private Position moveUp(Position currentPosition) {

		return new Position(currentPosition.getX() - 1, currentPosition.getY());
	}

	// Accepts a position and returns the value 
	// in the layerMatrix at that position. 
	// It basically tells us at which layer does
	// the given position lie.
	public int detectLayer(Position position) {

		int x = position.getX();
		int y = position.getY();

		return this.getLayerMatrix()[x][y];
	}
}