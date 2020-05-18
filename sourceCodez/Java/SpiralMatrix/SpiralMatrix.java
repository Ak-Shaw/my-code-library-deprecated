import java.io.*;
import java.util.*;

class SpiralMatrix {
    // Implement your solution by completing the below function
    public List<Integer> spiralOrder(int[][] matrix, int rowSize, int columbSize) {
        List<Integer> spiralOrderedList = new ArrayList<Integer>();
        
        Matrix matrixObj = new Matrix(rowSize, columbSize, matrix);
        Index currentIndex = new Index(0, -1);

        int noOfElements=rowSize*columbSize;
        int noOfElementsTraversed=0;
        int dir=-1;
        int nextElement=0;

        while(allElementsHaveNotBeenTraversed(noOfElements, noOfElementsTraversed)){

            dir=(dir+1)%4;

            while(notReachedRoadblock(matrixObj, currentIndex, dir)){

                switch(dir){

                    case 0:

                        nextElement=moveRight(matrixObj, currentIndex);
                        break;

                    case 1:

                        nextElement=moveDown(matrixObj, currentIndex);
                        break;

                    case 2:

                        nextElement=moveLeft(matrixObj, currentIndex);
                        break;

                    case 3:

                        nextElement=moveUp(matrixObj, currentIndex);
                        break;
                }

                spiralOrderedList.add(nextElement);
                updateCurrentIndex(currentIndex, dir);
                placeRoadblock(matrixObj, currentIndex);
                noOfElementsTraversed++;
            }
        }


        return spiralOrderedList;
    }

    private Boolean outOfBounds(Matrix matrix, Index index){

        if(index.getX()>=0 && index.getY()>=0 && index.getX()<matrix.getRowSize() && index.getY()<matrix.getColumbSize()){
          return false;
        } else {
          return true;
        }

    }

    private int moveRight(Matrix matrix, Index index){

        return matrix.getMatrix()[index.getX()][index.getY()+1];
    }

    private int moveDown(Matrix matrix, Index index){

        return matrix.getMatrix()[index.getX()+1][index.getY()];
    }

    private int moveLeft(Matrix matrix, Index index){

        return matrix.getMatrix()[index.getX()][index.getY()-1];
    }

    private int moveUp(Matrix matrix, Index index){

        return matrix.getMatrix()[index.getX()-1][index.getY()];
    }

    private void updateCurrentIndex(Index index, int dir){

        switch (dir) {
            
            case 0:

                index.setY(index.getY()+1);
                break;

            case 1:

                index.setX(index.getX()+1);
                break;

            case 2:

                index.setY(index.getY()-1);
                break;

            case 3:

                index.setX(index.getX()-1);
                break;
        }
    }

    private Boolean allElementsHaveNotBeenTraversed(int noOfElements, int noOfElementsTraversed){

        if(noOfElementsTraversed<noOfElements){
            return true;
        } else {
            return false;
        }

    }

    private Boolean notReachedRoadblock(Matrix matrix, Index currentIndex, int dir){

        int x=currentIndex.getX();
        int y=currentIndex.getY();

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

        Index newIndex = new Index(x,y);

        if(outOfBounds(matrix, newIndex)){
            return false;
        }

        if(matrix.getMatrix()[x][y]==Integer.MAX_VALUE){
            return false;
        }

        return true;
    }

    private void placeRoadblock(Matrix matrix, Index index){

        matrix.getMatrix()[index.getX()][index.getY()]=Integer.MAX_VALUE;

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                matrix[i][j] = scanner.nextInt();
        scanner.close();

        List<Integer> result = new SpiralMatrix().spiralOrder(matrix, n, m);
        for (int i = 0; i < result.size(); ++i)
            System.out.printf("%d ", result.get(i));
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

  public void setX(int x){
    this.x=x;
  }

  public void setY(int y){
    this.y=y;
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