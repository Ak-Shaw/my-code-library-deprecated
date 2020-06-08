class Solution {

public:
	struct Node {
		int key;
		int time;
		vector<Node *> child;
	};

	// Creates a node with the given key and time and returns it.
	Node* newNode(int key, int time) {
		Node* temp = new Node;
		temp -> key = key;
		temp -> time = time;
		return temp;
	}

	int dfs(int node, vector<Node*> &emp) {
		int time = 0;
		for (Node* child: emp[node]->child) {
			time = max(time, dfs(child->key, emp));
		}
		return emp[node]->time + time;
	}

	int numOfMinutes(int n, int headID, vector<int>& manager, vector<int>& informTime) {
		vector<Node*> Nodes;

		// Create n nodes for n employees
		for (int i = 0; i < n; i++) {
			Nodes.push_back(newNode(i, informTime[i]));
		}

		for (int i = 0; i < n; i++) {
			if (manager[i] != -1) {
				Nodes[manager[i]] -> child.push_back(Nodes[i]);
			}
		}

		return dfs(headID, Nodes);
	}
};