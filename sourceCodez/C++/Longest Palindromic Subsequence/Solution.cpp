#include<bits/stdc++.h>
using namespace std;

// This function recursively calculates the longest palindromic subsequence 
// and returns its length between low and high.
int longestPalindromicSubseqHelper(int low, int high, string &str, vector<vector<int>> &mem) {

	if (low == high) return 1; // since only one character so return the length which is one
	if (low > high) return 0; // low should be less than or equal to high
	if (mem[low][high] != -1) return mem[low][high];
	return mem[low][high] = str[low] == str[high] ? 2 + longestPalindromicSubseqHelper(low + 1, high - 1, str, mem) : 
			max(longestPalindromicSubseqHelper(low + 1, high, str, mem), longestPalindromicSubseqHelper(low, high - 1, str, mem));
}

/* 

	This function returns the length of the longest palindromic subseq 
	of the given string.
		@param
		string s: the input string
		return type: int

*/
int longestPalindromicSub(string &s) {
	if (s.empty()) return 0;
	int strLen = s.size();
	vector<vector<int>> mem(strLen, vector<int>(strLen, -1)); // 2D array of n * n, initialized with -1
	return longestPalindromicSubseqHelper(0, strLen - 1, s, mem);
}

int main() {
	string seq;
	cin >> seq;
	cout << longestPalindromicSub(seq) << endl;
	return 0;
}
