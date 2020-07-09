// Java program to find longest path of the tree 

import java.util.Arrays; 
import java.util.LinkedList; 
import java.util.Queue; 


class LongestPathUndirectedTree { 
	
	// Utility Pair class for storing maximum distance 
	// Node with its distance 
	static class Pair<T,V> { 
		T first; // maximum distance Node 
		V second; // distance of maximum distance node 
		
		//Constructor 
		Pair(T first, V second) { 
			this.first = first; 
			this.second = second; 
		} 
	} 
	
	// This class represents a undirected graph using adjacency list 
	static class Graph { 
		int V; // No. of vertices 
		LinkedList<Integer>[] adj; //Adjacency List 
		
		// Constructor 
		Graph(int V) { 
			this.V = V; 
			// Initializing Adjacency List 
			adj = new LinkedList[V]; 
			for(int i = 0; i < V; ++i) { 
				adj[i] = new LinkedList<Integer>(); 
			} 
		} 
		
		// function to add an edge to graph 
		void addEdge(int s, int d) { 
			adj[s].add(d); // Add d to s's list. 
			adj[d].add(s); // Since the graph is undirected 
		} 
		
		
		// method returns farthest node and its distance from node u 
		Pair<Integer, Integer> bfs(int u) { 
			int[] dis = new int[V]; 
			
			// mark all distance with -1 
			Arrays.fill(dis, -1); 

			Queue<Integer> q = new LinkedList<>(); 

			q.add(u); 
			
			// distance of u from u will be 0 
			dis[u] = 0; 
			while (!q.isEmpty()) { 
				int t = q.poll(); 
				
				// loop for all adjacent nodes of node-t 
				for(int i = 0; i < adj[t].size(); ++i) { 
					int v = adj[t].get(i); 
					
					// push node into queue only if 
					// it is not visited already 
					if(dis[v] == -1) { 
						q.add(v); 
						// make distance of v, one more 
						// than distance of t 
						dis[v] = dis[t] + 1; 
					} 
				} 
			} 

			int maxDis = 0; 
			int nodeIdx = 0; 
			
			// get farthest node distance and its index 
			for(int i = 0; i < V; ++i) { 
				if(dis[i] > maxDis) { 
					maxDis = dis[i]; 
					nodeIdx = i; 
				} 
			} 

			return new Pair<Integer, Integer>(nodeIdx, maxDis); 
		} 
		
		// method prints longest path of given tree 
		void longestPathLength() { 
			Pair<Integer, Integer> t1, t2; 
			
			// first bfs to find one end point of 
			// longest path 
			t1 = bfs(0); 
			
			// second bfs to find actual longest path 
			t2 = bfs(t1.first); 

			System.out.println("Longest path is from "+ t1.first 
			+ " to "+ t2.first +" of length "+t2.second); 
		} 
	} 
	
	// Driver code to test above methods 
	public static void main(String[] args){ 
		// Create a graph given in the example 
		
		Graph graph = new Graph(10); 
		graph.addEdge(0, 1); 
		graph.addEdge(1, 2); 
		graph.addEdge(2, 3); 
		graph.addEdge(2, 9); 
		graph.addEdge(2, 4); 
		graph.addEdge(4, 5); 
		graph.addEdge(1, 6); 
		graph.addEdge(6, 7); 
		graph.addEdge(6, 8); 

		graph.longestPathLength(); 
	} 

} 
// Added By Brij Raj Kishore 
