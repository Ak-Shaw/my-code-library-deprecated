import java.io.*;
import java.util.*;

class MatrixTraversal  {

  // complete the below function implementation
  public List<Integer> valueAtNewPosition(int[][] matrix, int rowSize, int columbSize, int currX, int currY, int dir, int steps) {
    List<Integer> valuesAlongPath = new ArrayList<Integer>();

    Matrix matrixObj = new Matrix(rowSize, columbSize, matrix);
    Index currentIndex = new Index(currX, currY);

    if(outOfBounds(matrixObj, currentIndex)){
      valuesAlongPath.add(-1);
      return valuesAlongPath;
    }

    int valueAlongPath=0;
    int stepsCovered=0;

    while(valueAlongPath>-1 && stepsCovered<steps){

      switch (dir) {

        case 1:

          valueAlongPath=moveRight(matrixObj, currentIndex, stepsCovered);
          break;

        case 2:

          valueAlongPath=moveDown(matrixObj, currentIndex, stepsCovered);
          break;

        case 3:

          valueAlongPath=moveLeft(matrixObj, currentIndex, stepsCovered);
          break;

        case 4:

          valueAlongPath=moveUp(matrixObj, currentIndex, stepsCovered);
          break;
        
      }

      stepsCovered++;

      if(valueAlongPath!=-1){
        valuesAlongPath.add(valueAlongPath);
      } else {
        if(!valuesAlongPath.isEmpty()){
          valuesAlongPath.clear();
        }
        valuesAlongPath.add(-1);
      }

    }

    return valuesAlongPath;
  }

  private int moveRight(Matrix matrix, Index initialIndex, int stepsCovered){

    Index newIndex = new Index(initialIndex.getX(), initialIndex.getY()+stepsCovered+1);

    if(outOfBounds(matrix, newIndex)){
      return -1;
    }

    return matrix.getMatrix()[newIndex.getX()][newIndex.getY()];
  }

  private int moveDown(Matrix matrix, Index initialIndex, int stepsCovered){

    Index newIndex = new Index(initialIndex.getX()+stepsCovered+1, initialIndex.getY());

    if(outOfBounds(matrix, newIndex)){
      return -1;
    }

    return matrix.getMatrix()[newIndex.getX()][newIndex.getY()];
  }

  private int moveLeft(Matrix matrix, Index initialIndex, int stepsCovered){

    Index newIndex = new Index(initialIndex.getX(), initialIndex.getY()-stepsCovered-1);

    if(outOfBounds(matrix, newIndex)){
      return -1;
    }

    return matrix.getMatrix()[newIndex.getX()][newIndex.getY()];
  }

  private int moveUp(Matrix matrix, Index initialIndex, int stepsCovered){

    Index newIndex = new Index(initialIndex.getX()-stepsCovered-1, initialIndex.getY());

    if(outOfBounds(matrix, newIndex)){
      return -1;
    }

    return matrix.getMatrix()[newIndex.getX()][newIndex.getY()];
  }

  private Boolean outOfBounds(Matrix matrix, Index index){

    if(index.getX()>=0 && index.getY()>=0 && index.getX()<matrix.getRowSize() && index.getY()<matrix.getColumbSize()){
      return false;
    } else {
      return true;
    }

  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] matrix = new int[n][m];

    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < m; ++j) {
        matrix[i][j] = scanner.nextInt();
      }
    }
    int currPosX = scanner.nextInt();
    int currPosY = scanner.nextInt();
    int dirToMove = scanner.nextInt();
    int stepsToMove = scanner.nextInt();

    scanner.close();
     List<Integer> result = new MatrixTraversal().valueAtNewPosition(matrix, n, m, currPosX, currPosY, dirToMove, stepsToMove);

    for (int i = 0; i < result.size(); ++i) {
      System.out.printf("%d ", result.get(i));
    }
  }
}

class Index{

  private int x;
  private int y;

  Index(int x, int y){

    this.x=x;
    this.y=y;

  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

}

class Matrix{

  private int rowSize;
  private int columbSize;
  private int[][] matrix;

  Matrix(int rowSize, int columbSize, int[][] matrix){

    this.rowSize=rowSize;
    this.columbSize=columbSize;
    this.matrix=new int[this.rowSize][this.columbSize];

    for(int i=0; i<this.rowSize; i++){
      for(int j=0; j<this.columbSize; j++){
        this.matrix[i][j]=matrix[i][j];
      }
    }

  }

  public int getRowSize(){
    return this.rowSize;
  }

  public int getColumbSize(){
    return this.columbSize;
  }

  public int[][] getMatrix(){
    return this.matrix;
  }
}