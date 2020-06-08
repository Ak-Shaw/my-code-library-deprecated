class Solution {
public:
    int minDistance(string word1, string word2) {
        
        int n1 = word1.size();
        int n2 = word2.size();
        
        // For memoization.
        vector<vector<int>> dp(n1, vector<int>(n2, -1));

        int result = cost(word1, word2, n1 - 1, n2 - 1, dp);
        
        return result;
    }
    
    int mini(int a, int b, int c) {
        
        return min(min(a, b), c);    
    }
    
    // We are placing a pointer at the end of each of the strings.
    // There are two scenarios to be encountered:
    // 1. The characters being pointed to by each pointer is the same, 
    //    thus no change is required, so we move to the next call by 
    //    decrementing the pointers.
    // 2. The characters are different and in such a case we have three choices: 
    //      
    //      a. Insert a character.
    //      b. Delete a character. 
    //      c. Replace a character.
    //
    // 3. We'll try all possible ways and thus find the minimum cost required.
    int cost(string &S, string &T, int i, int j, vector<vector<int>> &dp) {
        
        if (i < 0 || j < 0) {
            return abs(i - j);
        }
        
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        if (S[i] == T[j]) {
            return dp[i][j] = cost(S, T, i - 1, j - 1, dp);
        }
        
        return dp[i][j] = mini(1 + cost(S, T, i - 1, j - 1, dp),   // Replacement
                               1 + cost(S, T, i, j - 1, dp),       // Insertion
                               1 + cost(S, T, i - 1, j, dp));      // Deletion
    }
};