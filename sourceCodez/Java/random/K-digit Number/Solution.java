import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String n=sc.next();
        byte k=sc.nextByte();

        int l=n.length();

        int maxIndex;

        int lb=0, ub=l-1;

        String res="";

        char[] arr = n.toCharArray();

        while(k>0){

        	do{
        		
        		maxIndex=maxIndexWithinRange(arr, lb, ub);

        		ub=maxIndex-1;

        	} while(l-maxIndex<k);

        	res+=arr[(int)maxIndex];

        	lb=maxIndex+1;
        	ub=l-1;

        	k--;

        }

        System.out.println(res);
    }

    private static int maxIndexWithinRange(char[] arr, int lb, int ub){

    	int maxIndex=lb;

    	for(int i=lb+1; i<=ub; i++){

    		if(arr[i]>arr[maxIndex]){
    			maxIndex=i;
    		}

    	}

    	return maxIndex;

    }
}