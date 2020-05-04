/*
Restaurants
Problem Description
Looking for a place to rent in New York, Codu wants to stay in a place close to as many restaurants 
as possible and walk as little as possible to reach them. As he is a vegetarian, and likes only some 
types of food, there are only a few restaurants that meet his criteria.
For convenience he models the roads as rectangular grid roads and plots the restaurant locations at 
the intersection of two roads there. To simplify further, he approximates the distance as the number 
of blocks between two places. Given the maximum distance he wants to walk, he wants to find the most 
optimal location (from which he can reach the maximum number of restaurants within that distance).
The grid starts at (0,0) at the southwest corner, and goes to (N,0) at the south east corner, and 
to (N,M) at the north east corner. If two locations the same (maximum) number of restaurants he can 
walk to, he would prefer to have the southernmost location (lowest Y coordinate). If two locations 
lie on the same southernmost road and have the same (maximum) number of restaurants he can walk to, 
he would prefer the westernmost location (lowest X coordinate).
Constraints
1 < N,M,K <= 1000
House can’t be in the same block where there exists a restaurant
Input Format
First line contains two integers N, M the number of horizontal and vertical blocks (intervals between roads). 
The grid is given the coordinates starting with (0,0) on the lower left corner and (N,M) the upper right corner.
The next line contains K, the number of restaurants.
The next K pairs of integers give the coordinates of the K restaurants.
The next line gives the distance he wants to walk (in blocks)
Output
Three integers, first two giving the coordinates of the optimal location and the next integer giving 
the number of restaurants reachable from that location.

Test Case

Example 1
Input
4 4
5
1 1
1 2
3 3
4 4
2 4
4
Output
3 1 5

*/

import java.util.*;

public class Restaurants
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        sc.nextLine();

        // the DDA below will consist of -1s in the
        // coordinates of the restaurants.
        // once rotated anti-clockwise, it will be
        // portrayed as depicted in given problem statement.
        int a[][]=new int[N][M];

        int K=sc.nextInt();
        sc.nextLine();

        //applying constraints
        if(N<2||M<2||K<2||N>1000||M>1000||K>1000)
            System.exit(0);
        
        // creating a DDA to store coordinates of K restaurants
        int c[][]=new int[K][2];

        // accepting coordinates of K restaurants in c[][] and 
        // placing -1 in those coordinates of a[][]
        for(int i=0;i<K;i++)
        {
        	c[i][0]=sc.nextInt()-1;
        	c[i][1]=sc.nextInt()-1;
        	a[c[i][0]][c[i][1]]=-1;
        	sc.nextLine();
        }

        // accepting permissible no. of inlying blocks
        int d=sc.nextInt();

        // storing max no. of restaurants within the range of 'd'
        int mrc=0;

        // this dual looping structure iterates through
        // all the coordinates of the map depicted in a[][].
        // if the map contains 0, that means it's an empty
        // spot. if it contains -1 then it's a restaurant.
        // if it's a 0 then it counts the total no. of 
        // restaurants reachable within permissible limits 'd'
        // and places that value in place of that coordinate of
        // a[][]. it also stores the maximum no. of restaurants 
        // reachable within permissible limits in 'mrc'
        for(int i=0;i<N;i++)
        {
        	for(int j=0;j<M;j++)
        	{
        		if(a[i][j]==0)
        		{
        			int rc=0;
        			for(int l=0;l<K;l++)
        			{
        				int rcp;

        				if(i==c[l][0]) // case 1: if the origin and destination lie in the same row
        				{
        					rcp=j-c[l][1];
        					if(c[l][1]>j)
        						rcp=-rcp;
        				}
        				else if(j==c[l][1]) // case 2: if the origin and destination lie in the same column
        				{
        					rcp=i-c[l][0];
        					if(c[l][0]>i)
        						rcp=-rcp;
        				}
        				else 
        				{
        					// case 3: otherwise it finds the intersection point
        					// of the common column and row of origin and destination
        					// and counts the number of blocks to travel via column
        					// then counts the number of blocks to travel via row.
        					// adds them up and gets the resultant no. of blocks

        					if(i<c[l][0])
        					{
        						int ipx=c[l][0];
        						int ipy=j;

        						int rcp1,rcp2;

        						rcp1=i-ipx;
        						if(ipx>i)
        							rcp1=-rcp1;

        						rcp2=j-ipy;
        						if(ipy>j)
        							rcp2=-rcp2;

        						rcp=rcp1+rcp2;
        					}
        					else
        					{
        						int ipx=i;
        						int ipy=c[l][1];

        						int rcp1,rcp2;

        						rcp1=c[l][0]-ipx;
        						if(ipx>c[l][0])
        							rcp1=-rcp1;

        						rcp2=c[l][1]-ipy;
        						if(ipy>c[l][1])
        							rcp2=-rcp2;

        						rcp=rcp1+rcp2;
        					}
        				}

        				// decrementing by 1 since we need to count the blocks
        				// in between the origin and destination(restaurant)
        				rcp--; 

        				// if the no. of blocks is within permissible limits
        				// then we increment the 'restaurant count' i.e. 'rc' by 1
        				if(rcp<=d)
        					rc++;
        			}

        			// we place the 'rc' in the 'blank' coordinate
        			a[i][j]=rc;

        			// we store the 'max restaurant count' in 'mrc'
        			if(rc>mrc)
        				mrc=rc;
        		}
        	}
        }

        int i,j,p=0;

        // searches for the row(southernmost lane)
        // which contains 'mrc'
        for(i=0;i<M;i++)
        {
        	for(j=0;j<N;j++)
        		if(a[j][i]==mrc)
        		{
        		    p=1;
        			break;
                }
                if(p==1)
                    break;
        }

        // declares DDA which will store the coordinates
        // of the lane 'n' with 'mrc'. 
        // it stores -1,-1 where there's a restaurant and
        // stores the respective coordinate if it contains 
        // a number rather than -1, which signifies the 'rc'
        // at that coordinate
        int co[][]=new int[N][2];

        //stores the coordinates of above mentioned
        for(j=0;j<N;j++)
        {
        	if(a[j][i]==-1||a[j][i]!=mrc)
        	{
        		co[j][0]=co[j][1]=-1;
        	}
        	else
        	{
        		co[j][0]=j;
        		co[j][1]=i;
        	}
        }

        // declares the SDA which stores the no. of blocks
        // to travel to reach the farthest restaurant w.r.t. 
        // the above coordinates of co[][]. 
        // if coordinate of co[][]=-1,-1 then the looping 
        // structure below stores d+1 to q[i].
        // we need the lowest no. of blocks stored in q[]
        int q[]=new int[N];

        for(i=0;i<N;i++)
        {
        	if(co[i][0]!=-1)
        	{
        		int mrcp=0;
        		for(int l=0;l<K;l++)
        			{
        				int rcp;

        				// this time our goal is to find the 
        				// no. of blocks needed to travel to 
        				// the farthest restaurant and store it to q[]
        				// w.r.t. the coordinates in co[][].
        				// if the coordinates contain a restaurant, i.e.,
        				// coordinates are -1,-1 then assign q[i]=d+1.
        				// that value will be skipped since we need the 
        				// lowest no. of blocks to travel for the farthest 
        				// restaurant from a certain coordinate

        				if(co[i][0]==c[l][0]) // case 1: same as above
        				{
        					rcp=co[i][1]-c[l][1];
        					if(c[l][1]>co[i][1])
        						rcp=-rcp;
        				}
        				else if(co[i][1]==c[l][1]) // case 2: same as above
        				{
        					rcp=co[i][0]-c[l][0];
        					if(c[l][0]>co[i][0])
        						rcp=-rcp;
        				}
        				else // case 3: same as above
        				{
        					if(co[i][0]<c[l][0])
        					{
        						int ipx=c[l][0];
        						int ipy=co[i][1];

        						int rcp1,rcp2;

        						rcp1=co[i][0]-ipx;
        						if(ipx>co[i][0])
        							rcp1=-rcp1;

        						rcp2=co[i][1]-ipy;
        						if(ipy>co[i][1])
        							rcp2=-rcp2;

        						rcp=rcp1+rcp2;
        					}
        					else
        					{
        						int ipx=co[i][0];
        						int ipy=c[l][1];

        						int rcp1,rcp2;

        						rcp1=c[l][0]-ipx;
        						if(ipx>c[l][0])
        							rcp1=-rcp1;

        						rcp2=c[l][1]-ipy;
        						if(ipy>c[l][1])
        							rcp2=-rcp2;

        						rcp=rcp1+rcp2;
        					}
        				}

        				if(rcp>mrcp)
        					mrcp=rcp;
        			}
        			q[i]=mrcp;

        	}
        	else
        		q[i]=d+1;
        }

        // finds the min no. of blocks to the farthest restaurant as
        // mentioned above and stores the index of that coordinate 
        // stored in co[][] in minqi
        int minqi=0,minq=q[0];
        for(i=1;i<N;i++)
        	if(q[i]<minq)
        	{
        		minq=q[i];
        		minqi=i;
        	}

        // prints the required data
        System.out.print((co[minqi][0]+1)+" "+(co[minqi][1]+1)+" "+mrc);

        /*
         * The matrix as represented in the problem statement is as follows
           [rotated 90 degrees anti-clockwise]
        
        for(i=M-1;i>-1;i--)
        {
            for(j=0;j<N;j++)
                System.out.print(a[j][i]+"\t");
            System.out.println();
        }
        */
	}
}