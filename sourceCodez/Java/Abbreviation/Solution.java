import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String abbreviation(String aS, String bS) {

        char[] a = aS.toCharArray();
        char[] b = bS.toCharArray();

        int n,m;

        n=aS.length();
        m=bS.length();
        int[][] d = new int[n+1][m+1];
        for(int j=0;j<=m;j++){
            if(j==0)
                d[0][j]=1;
            else d[0][j]=0;
        }

        int count=0;

        for(int k=1;k<=n;k++){
            int i=k-1;
            if(a[i]>=65&&a[i]<=90||count==1){
                count=1;
                d[k][0]=0;
            }else d[k][0]=1; 
        }

        for(int k=1;k<=n;k++){
            int i=k-1;
            for(int l=1;l<=m;l++){
                int j=l-1;
                if(a[i]==b[j]){
                    d[k][l]=d[k-1][l-1];
                    continue;
                }
                else {
                    if(Character.toUpperCase(a[i])==b[j]){
                        d[k][l]=d[k-1][l-1]|d[k-1][l];
                        continue;
                    }
                }
                if(a[i]>=65&&a[i]<=90){
                    d[k][l]=0;
                    continue;
                }
                else{
                 d[k][l]=d[k-1][l];
                 continue; 
                }
            }
        }

       if(d[n][m] == 1) return "YES";
       else return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
