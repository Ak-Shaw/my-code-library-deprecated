class Solution {

	// Traverse through the first column and if the first element 
	// of a row <= target then do binary search in that row, if 
	// element is found then return true. Otherwise break and 
	// return false.
    public boolean searchMatrix(int[][] matrix, int target) {

    	for (int i = 0; i < matrix.length; i++) {

    		if (matrix[i][0] <= target) {

    			boolean searchResult = binarySearch(matrix[i], target);

    			if (searchResult) {

    				return true;
    			}
    		
    		} else {

    			break;
    		}
    	}

        return false;
    }

    public boolean binarySearch(int[] arr, int target) {

    	int lb = 0, ub = arr.length - 1, mid;

    	while (lb <= ub) {

    		mid = lb + (ub - lb) / 2;

    		if (arr[mid] == target) {

    			return true;
    		
    		} 

    		if (target < arr[mid]) {

    			ub = mid - 1;
    		
    		} else {

    			lb = mid + 1;
    		}

    	}

    	return false;
    }
}
