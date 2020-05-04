import java.io.*;
import java.util.*;

class NumberOfIslands {

    // Implement your solution by completing the below function
    public int numIslands(char[][] grid, int rows, int columns) {

        Grid gridObj = new Grid(rows, columns, grid);

        int islandCount = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){

                if(gridObj.getGrid()[i][j]=='1'){

                    islandCount++;
                    gridObj.getGrid()[i][j]='0';

                    connectLands(gridObj, new Index(i, j));

                    // System.out.println("grid state after connectLands :\n\n"+gridObj);

                }

            }
        }

        return islandCount;
    }

    private void placeRoadblock(Grid grid, Index index){

        grid.getGrid()[index.getX()][index.getY()]='0';

    }

    private void connectLands(Grid grid, Index index){

        Stack<Index> downStack = new Stack<>();
        Stack<Index> rightStack = new Stack<>();
        Stack<Index> leftStack = new Stack<>();
        Stack<Index> upStack = new Stack<>();

        downStack.push(index);
        rightStack.push(index);

        while(!(rightStack.empty()&&downStack.empty()&&leftStack.empty()&&upStack.empty())){

            while(!downStack.empty()){

                Index currentIndex = new Index(downStack.peek().getX(), downStack.pop().getY());

                while(notReachedRoadblock(grid, currentIndex, 1)){

                    updateCurrentIndex(currentIndex, 1);

                    placeRoadblock(grid, currentIndex);

                    rightStack.push(new Index(currentIndex.getX(),currentIndex.getY()));
                    leftStack.push(new Index(currentIndex.getX(),currentIndex.getY()));

                }

            }

            while(!upStack.empty()){

                Index currentIndex = new Index(upStack.peek().getX(), upStack.pop().getY());

                while(notReachedRoadblock(grid, currentIndex, 3)){

                    updateCurrentIndex(currentIndex, 3);

                    placeRoadblock(grid, currentIndex);

                    rightStack.push(new Index(currentIndex.getX(),currentIndex.getY()));
                    leftStack.push(new Index(currentIndex.getX(),currentIndex.getY()));

                }

            }

            while(!rightStack.empty()){

                Index currentIndex = new Index(rightStack.peek().getX(), rightStack.pop().getY());

                while(notReachedRoadblock(grid, currentIndex, 0)){

                    updateCurrentIndex(currentIndex, 0);

                    placeRoadblock(grid, currentIndex);

                    downStack.push(new Index(currentIndex.getX(),currentIndex.getY()));
                    upStack.push(new Index(currentIndex.getX(),currentIndex.getY()));
                }

            }

            while(!leftStack.empty()){

                Index currentIndex = new Index(leftStack.peek().getX(), leftStack.pop().getY());

                while(notReachedRoadblock(grid, currentIndex, 2)){

                    updateCurrentIndex(currentIndex, 2);

                    placeRoadblock(grid, currentIndex);

                    downStack.push(new Index(currentIndex.getX(),currentIndex.getY()));
                    upStack.push(new Index(currentIndex.getX(),currentIndex.getY()));
                }

            }

        }   

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

    private Boolean notReachedRoadblock(Grid grid, Index currentIndex, int dir){

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

        if(outOfBounds(grid, newIndex)){
            return false;
        }

        if(grid.getGrid()[x][y]=='0'){
            return false;
        }

        return true;
    }

    private Boolean outOfBounds(Grid grid, Index index){

        if(index.getX()>=0 && index.getY()>=0 && index.getX()<grid.getRowSize() && index.getY()<grid.getColumbSize()){
          return false;
        } else {
          return true;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        char[][] grid = new char[rows][columns];
        int c=0;

        for (int i = 0; i < rows; ++i) {
            String s = scanner.next();
            for (int j = 0; j < columns; ++j) {
                grid[i][j] = s.charAt(j);

                if(grid[i][j]=='0'||grid[i][j]=='1')
                    c++;

            }
        }
        scanner.close();

        if(c==rows*columns){
            int result = new NumberOfIslands().numIslands(grid, rows, columns);
            System.out.println(result);
        } else {
            System.out.println(0);
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

  public void setX(int x){
    this.x=x;
  }

  public void setY(int y){
    this.y=y;
  }

}

class Grid{

  private int rowSize;
  private int columbSize;
  private char[][] grid;

  Grid(int rowSize, int columbSize, char[][] grid){

    this.rowSize=rowSize;
    this.columbSize=columbSize;
    this.grid=new char[this.rowSize][this.columbSize];

    for(int i=0; i<this.rowSize; i++){
      for(int j=0; j<this.columbSize; j++){
        this.grid[i][j]=grid[i][j];
      }
    }

  }

  public int getRowSize(){
    return this.rowSize;
  }

  public int getColumbSize(){
    return this.columbSize;
  }

  public char[][] getGrid(){
    return this.grid;
  }

  public String toString(){

    String g="";

    for(int i=0; i<this.rowSize; i++){

        for(int j=0; j<this.columbSize; j++){

            g+="\t"+this.getGrid()[i][j];
        }

        g+="\n";
    }

    return g;

  }
}