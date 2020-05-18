import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        long x=sc.nextLong();
        long y=sc.nextLong();

        long z=x;

        int c=0;

        long z1, z2;

        boolean loop=true;

        while(loop){

        	if(y>x){

        		z1=reverse(x);

        		if(z1>x){

        			x=z1;
        			c++;

        		} else {

        			loop=false;
        			c=-1;
        			break;

        		}

        	} else if(y<x){

        		z1=reverse(x);
        		z2=x/10;

        		if(z1<x && z1<=z2 && z1>=y){
        			
        			x=z1;
        			
        		} else {

        			x=z2;
	
        		} 

        		c++;

        		if(x<y){

        			z1=reverse(x);

        			if(z1<y){

        				c=-1;
        				break;

        			}

        		}

        	} else {

        		loop=false;
        		break;

        	}

        }

        String s=Long.toString(z);

        int c2=s.length();;

        if(y/10==0){

        	
        	int q=(int)s.charAt(0)-48;

        	if(q==y)
        		c2=s.length()-1;

        	if(c==-1 && s.indexOf((char)y+48)!=-1)
        		c=c2;
        }

        System.out.println(c);
    }

    private static long reverse(long n){

    	long r=0;

    	while(n>0){

    		r=r*10+n%10;
    		n/=10;

    	}

    	return r;
    }
}