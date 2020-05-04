import java.io.*;
import java.util.*;

class MessagePassing  {

  int dir=-1;

  // Complete the below function implementation
  // Print "Yes" for success and "No" for Failure
  public void messagePassTest(int n, int s, int m, int[][] matrix) {

    Matrix matrixObj = new Matrix(n, n, matrix);
    Index currentIndex = new Index(0, -1);

    Stack<Index2> backTrackStack = new Stack<Index2>();

    Stack<Object> superStack = new Stack<Object>();

    Stack<Person> subStack = new Stack<Person>();

    subStack.push(new Person(0, -1, s+1, -1));

    superStack.push(subStack);

    int noOfElements=n*n;
    int noOfElementsTraversed=0;
    
    int nextElement=0;

    while(!superStack.empty()){

      Person currentPerson=peekPop(superStack);
      int cellsToTraverse=currentPerson.getVoiceStrength();
      subStack=new Stack<Person>();

      if(!currentPerson.getIndex().same(currentIndex)){
        int noOfCellsBackTracked=backTrack(matrixObj, backTrackStack, currentPerson.getBackTrackIndex(), noOfElementsTraversed
          );

        

        currentIndex=new Index(currentPerson.getIndex().getX(), currentPerson.getIndex().getY());

        

        noOfElementsTraversed-=noOfCellsBackTracked;
      }

      if(noOfElementsTraversed+cellsToTraverse>=noOfElements){
        System.out.print("Yes");
        return;
      }
    
      while(allElementsHaveNotBeenTraversed(noOfElements, noOfElementsTraversed) && cellsToTraverse>0){

              if(dir==-1)
                dir=(dir+1)%4;
              else if(!notReachedRoadblock(matrixObj, currentIndex, dir))
                dir=(dir+1)%4;


              while(notReachedRoadblock(matrixObj, currentIndex, dir) && cellsToTraverse>0){

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

                updateCurrentIndex(currentIndex, dir);
                noOfElementsTraversed++;

                

                backTrackStack.push(new Index2(currentIndex.getX(), currentIndex.getY(), dir));

                placeRoadblock(matrixObj, currentIndex);
                
                cellsToTraverse--;

                if(nextElement!=0)
                  subStack.push(new Person(currentIndex.getX(), currentIndex.getY(), nextElement, noOfElementsTraversed-1));
              }
      }

      if(!subStack.empty())
        superStack.push(subStack);

    }

    System.out.print("No");

  }

  private void removeRoadblock(Matrix matrix, Index2 index){

    matrix.getMatrix()[index.getX()][index.getY()]=0;

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

  private Person peekPop(Stack<Object> superStack){

    Stack<Object> subStack=(Stack<Object>)superStack.peek();

    Person nextPerson=(Person)subStack.pop();

    if(subStack.empty()){
      superStack.pop();
    }

    return nextPerson;

  }

  private Boolean allElementsHaveNotBeenTraversed(int noOfElements, int noOfElementsTraversed){

        if(noOfElementsTraversed<noOfElements){
            return true;
        } else {
            return false;
        }

  }

  private void placeRoadblock(Matrix matrix, Index index){

        matrix.getMatrix()[index.getX()][index.getY()]=Integer.MAX_VALUE;

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

  private int backTrack(Matrix matrix, Stack<Index2> backTrackStack, int destinationIndex, int noOfElementsTraversed){

    int lastIndex = noOfElementsTraversed - 1;

    
    int noOfCellsToBeBackTracked = lastIndex - destinationIndex;
    int noOfCellsBackTracked=noOfCellsToBeBackTracked;

    

    while(noOfCellsToBeBackTracked>0){

      

      removeRoadblock(matrix, backTrackStack.pop());
      
      

      noOfCellsToBeBackTracked--;

      

    }

    if(!backTrackStack.empty())
      dir=backTrackStack.peek().getDir();

    return noOfCellsBackTracked;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int s = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] matrix = new int[n][n];

    for(int i = 0 ; i < m ; ++i) {
        int x , y , p;
        x = scanner.nextInt();
        y = scanner.nextInt();
        p = scanner.nextInt();
        matrix[x][y] = Math.max(p, matrix[x][y]);
    }
    scanner.close();
    new MessagePassing().messagePassTest(n,s,m,matrix);
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

  public boolean same(Index index){

    if(this.getX()==index.getX() && this.getY()==index.getY())
      return true;

    return false;
  }

  public String toString(){
    return "["+this.getX()+", "+this.getY()+"]";
  }

}

class Index2{

  private int x;
  private int y;
  private int dir;

  Index2(int x, int y, int dir){

    this.x=x;
    this.y=y;
    this.dir=dir;

  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  public int getDir(){
    return this.dir;
  }

  public void setX(int x){
    this.x=x;
  }

  public void setY(int y){
    this.y=y;
  }

  public boolean same(Index index){

    if(this.getX()==index.getX() && this.getY()==index.getY())
      return true;

    return false;
  }

  public String toString(){
    return "["+this.getX()+", "+this.getY()+"]";
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

  public String toString(){
    
    String m="";

    for(int i=0; i<this.getRowSize(); i++){
      for(int j=0; j<this.getColumbSize(); j++){
        m+="\t"+this.getMatrix()[i][j];
      }
      m+="\n";
    }

    return m;
  }
}

class Person{

  private int x;
  private int y;
  private int voiceStrength;
  private Index index;
  private int backTrackIndex;

  Person(int x, int y, int voiceStrength, int backTrackIndex){

    this.x=x;
    this.y=y;
    this.index=new Index(x,y);
    this.voiceStrength=voiceStrength;
    this.backTrackIndex=backTrackIndex;

  }

  int getX(){
    return this.x;
  }

  int getY(){
    return this.y;
  }

  Index getIndex(){
    return this.index;
  }

  int getVoiceStrength(){
    return this.voiceStrength;
  }

  int getBackTrackIndex(){
    return this.backTrackIndex;
  }

}