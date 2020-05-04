class MagicSquare3{
    public static void generateMagicSquare( int n ){
        int magic[][] = new int[ n ][ n ];
        int row = 0, col = n / 2, i, j, square = n * n;
        for( i=1; i <= square ; i++ ){
            magic[ row ][ col ] = i;
            if( i % n == 0 ) row++;
            else{
                if( row == 0 ) row = n - 1;
                else row--;
                if( col == ( n - 1 ) ) col = 0;
                else col++;
            }
        }
        for( i = 0; i < n ; i++ ){
            for( j = 0; j < n; j++ ){
                System.out.print( magic[ i ][ j ] + "\t" );
            }
            System.out.println();
        }
    }
 
    public static void main(String args[]){
        generateMagicSquare(7);
    }
}