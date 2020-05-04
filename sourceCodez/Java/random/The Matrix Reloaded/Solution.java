import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    	Scanner sc=new Scanner(System.in);

    	byte tc=sc.nextByte();

    	short[] results=new short[tc];

    	for(byte i=0; i<tc; i++){

    		byte n=sc.nextByte();

    		long[][] h=new long[n][n];
    		long[] ht=new long[n*n];

    		short c=0;

    		for(byte j=0; j<n; j++){

    			for(byte k=0; k<n; k++){

    				h[j][k]=sc.nextLong();
    				ht[c++]=h[j][k];

    			}

    		}

    		long s=ht[0];
    		long t=ht[n*n/2];

    		if(n==1)
    			results[i]=0;
    		else if(t>=s)
    			results[i]=-1;
    		else{

    			sort(ht);

    			short si=-1;
    			short ti=-1;

    			for(short j=0; j<c; j++){

    				if(ht[j]==t)
    					ti=j;

    				if(ht[j]==s){
    					si=j;
    					break;
    				}

    			}

    			results[i]=(short)(si-ti);

    		}

    	}

    	for(byte i=0; i<tc; i++)
    		System.out.println(results[i]);

    }

    static void sort(long[] arr)  
    { 
        long max = Arrays.stream(arr).max().getAsLong(); 
        long min = Arrays.stream(arr).min().getAsLong(); 
        short range = (short)(max - min + 1); 
        int count[] = new int[range]; 
        long output[] = new long[arr.length]; 
        for (short i = 0; i < arr.length; i++)  
        { 
            count[(int)(arr[i] - min)]++; 
        } 
  
        for (short i = 1; i < count.length; i++)  
        { 
            count[i] += count[i - 1]; 
        } 
  
        for (short i = (short)(arr.length - 1); i >= 0; i--)  
        { 
            output[count[(int)(arr[i] - min)] - 1] = arr[i]; 
            count[(int)(arr[i] - min)]--; 
        } 
  
        for (short i = 0; i < arr.length; i++) 
        { 
            arr[i] = output[i]; 
        } 
    }
}