class Solution {
    public String longestPalindrome(String text) {
        
        int N = text.length(); 
        if (N == 0) 
            return ""; 
        if (N == 1) 
            return text;

        // Position count 
        N = 2 * N + 1;  

        // LPS Length Array 
        int []L = new int [N];  
        L[0] = 0; 
        L[1] = 1; 

        // centerPosition  
        int C = 1; 

        // centerRightPosition 
        int R = 2;  

        // currentRightPosition 
        int i = 0;  

        // currentLeftPosition 
        int iMirror;  
        int expand = -1; 
        int diff = -1; 
        int maxLPSLength = 0; 
        int maxLPSCenterPosition = 0; 
        int start = -1; 
        int end = -1; 

        // Uncomment it to print LPS Length array 
        // printf("%d %d ", L[0], L[1]); 
        for (i = 2; i < N; i++)  
        { 
            // Get currentLeftPosition iMirror 
            // for currentRightPosition i 
            iMirror = 2 * C - i; 

            // Reset expand - means no  
            // expansion required 
            expand = 0; 
            diff = R - i; 

            // If currentRightPosition i is  
            // within centerRightPosition R 
            if(diff >= 0)  
            { 

                // Case 1 
                if(L[iMirror] < diff)  
                    L[i] = L[iMirror]; 

                // Case 2 
                else if(L[iMirror] == diff && R == N - 1)  
                    L[i] = L[iMirror]; 

                // Case 3 
                else if(L[iMirror] == diff && R < N - 1)  
                { 
                        L[i] = L[iMirror]; 

                         // Expansion required 
                        expand = 1; 
                } 

                // Case 4 
                else if(L[iMirror] > diff)  
                { 
                    L[i] = diff; 

                    // Expansion required 
                    expand = 1;  
                } 
            } 
            else
            { 
                L[i] = 0; 

                // Expansion required 
                expand = 1;  
            } 

            if (expand == 1) 
            { 

                // Attempt to expand palindrome centered 
                // at currentRightPosition i. Here for odd 
                // positions, we compare characters and  
                // if match then increment LPS Length by ONE 
                // If even position, we just increment LPS 
                // by ONE without any character comparison 
                try
                { 
                    while (((i + L[i]) < N &&  
                            (i - L[i]) > 0) && 
                          (((i + L[i] + 1) % 2 == 0) || 
                           (text.charAt((i + L[i] + 1) / 2) ==  
                            text.charAt((i - L[i] - 1) / 2)))) 
                    { 
                        L[i]++; 
                    } 
                } 
                catch (Exception e) 
                { 
                    assert true; 
                } 
            } 

            // Track maxLPSLength 
            if(L[i] > maxLPSLength)  
            { 
                maxLPSLength = L[i]; 
                maxLPSCenterPosition = i; 
            } 

            // If palindrome centered at  
            // currentRightPosition i expand 
            // beyond centerRightPosition R, 
            // adjust centerPosition C based 
            // on expanded palindrome. 
            if (i + L[i] > R)  
            { 
                C = i; 
                R = i + L[i]; 
            } 

            //Uncomment it to print LPS Length array 
            //System.out.print("%d ", L[i]); 
        } 

        start = (maxLPSCenterPosition -  
                 maxLPSLength) / 2; 
        end = start + maxLPSLength - 1; 

        //System.out.print("start: %d end: %d\n",  
        //                  start, end); 
        // System.out.print("LPS of string is " +  
        //                   text + " : "); 

        // for(i = start; i <= end; i++) 
        //     System.out.print(text.charAt(i)); 
        // System.out.println(); 
        
        String palin = "";
        for (i = start; i <= end; i++) {
            palin += text.charAt(i);
        }
        
        return palin;
    }
}