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

    TreeNode prev;

    boolean validateBinarySearchTree(TreeNode root) {

        prev = null;
        return isBST(root);
    }

    boolean isBST(TreeNode node) {

        if (node != null) {

            if (!isBST(node.left))
                return false;

            if (prev != null && node.val <= prev.val)
                return false;

            prev = node;

            return isBST(node.right);
        }

        return true;
    }
}

/*

1) Do In-Order Traversal of the given tree and store the 
result in a temp array.
3) Check if the temp array is sorted in ascending order, if it 
is, then the tree is BST.

Time Complexity: O(n)

We can avoid the use of Auxiliary Array. While doing In-Order 
traversal, we can keep track of previously visited node. If the 
value of the currently visited node is less than the previous value, 
then tree is not BST. 

*/