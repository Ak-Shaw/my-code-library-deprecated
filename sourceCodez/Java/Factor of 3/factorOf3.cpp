#include <bits/stdc++.h> 
using namespace std; 

void count_k( 
	vector<int>& arr, 
	int& b0, 
	int& b1, 
	int& b2) 
{ 
	
	for (int i = 0; i < arr.size(); i++) { 

		if (arr[i] % 3 == 0) { 
			b0++; 
		} 
		else if (arr[i] % 3 == 1) { 
			b1++;  
		} 
		else { 
			b2++;  
		} 
	} 
	return; 
} 

void solve(int n, vector<int>& arr) 
{
	int b0 = 0, b1 = 0, b2 = 0; 
	
	count_k(arr, b0, b1, b2); 

	if ((b0 == 0 && b1 != 0 && b2 != 0) or b0 > b1 + b2 + 1) { 
		cout << "No" << endl;  
	} else {
		cout << "Yes" << endl;
	}
} 

signed main() 
{ 

	int t;

	cin >> t;

	for (int i = 0; i < t; i++) {

		int n;

		cin >> n;

		vector<int> a;

		for(int j = 0; j < n; j++) {

			int temp;
			cin >> temp;

			a.push_back(temp);
		}

		solve(n, a);
	}

	return 0;
} 
