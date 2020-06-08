import java.util.*;
import crio.ds.Tree.TreeNode;

/*
// Definition of TreeNode
public class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}
*/

public class Solution {

    long answer = 0;
    
    long pathsWithSumRootToLeaf(TreeNode root, long k) {
    
        countPaths(root, 0, k);
        return answer;
    }

    void countPaths(TreeNode root, long current_sum, long target) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            if ((current_sum + root.val) == target) {
                answer++;
            }
        }

        countPaths(root.left, current_sum + root.val, target);
        countPaths(root.right, current_sum + root.val, target);
    }
}
