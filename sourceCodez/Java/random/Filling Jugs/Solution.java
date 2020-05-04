import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
      	Scanner scanner = new Scanner(System.in);
      	int T = scanner.nextInt();

        long[] result=new long[T];

      	for(int _t = 0 ; _t < T ; ++_t){
            int n = scanner.nextInt();
          	int C[] = new int[n];

            long res=0;

          	for(int i = 0 ; i < n ; ++i) {
              	C[i] = scanner.nextInt();

                if(i==0){
                  res+=C[i];
                  continue;
                }
                
                  if(C[i]>C[i-1])
                    C[i]=C[i-1];

                res+=C[i];
            }

            result[_t]=res;
        	
        }

        for(int i=0; i<T; i++){
          System.out.println(result[i]);
        }
        
    }
}