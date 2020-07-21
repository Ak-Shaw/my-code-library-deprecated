import java.io.*;
import java.util.*;

public class Solution {

	static int numberOfVisited;
	static boolean[] visited;

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	// number of tasks
    	int n = sc.nextInt();

    	// number of dependencies
    	int d = sc.nextInt();

    	// task we need to find about
    	int k = sc.nextInt();

    	ArrayList<ArrayList<Integer>> adjList1 = new ArrayList<>();
    	init(adjList1, n);
    	ArrayList<ArrayList<Integer>> adjList2 = new ArrayList<>();
    	init(adjList2, n);

    	for (int i = 0; i < d; i++) {

    		int x = sc.nextInt();
    		int y = sc.nextInt();

    		adjList1.get(x).add(y);
    		adjList2.get(y).add(x);
    	}

    	visited = new boolean[n + 1];

    	numberOfVisited = 0;
    	dfs(adjList2, k);
    	int minTasks = numberOfVisited;

    	numberOfVisited = 0;
    	dfs(adjList1, k);
    	int maxTasks = n - numberOfVisited - 1;

    	System.out.println(minTasks + " " + maxTasks);
    }

    static void init(ArrayList<ArrayList<Integer>> adjList, int n) {

    	for (int i = 0; i <= n; i++) {
    		adjList.add(new ArrayList<>());
    	}
    }

    static void dfs(ArrayList<ArrayList<Integer>> adjList, int node) {

    	for (int i = 0; i < adjList.get(node).size(); i++) {
    		
    		int curNode = adjList.get(node).get(i);

    		if (!visited[curNode]) {
    			visited[curNode] = true;
    			numberOfVisited++;
    			dfs(adjList, curNode);
    		}
    		
    	}

    }
}