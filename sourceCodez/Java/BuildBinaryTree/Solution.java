import crio.ds.Tree.TreeNode;
import java.util.*;
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

    int preorder_index = 0; // Global value to be retained across recursions
    // HashMap that can be used to quickly lookup In-Order value's index
    HashMap<Integer, Integer> index_lookup = new HashMap<Integer, Integer>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int index = 0;
        for (Integer val : inorder)
            index_lookup.put(val, index++);
        return recursiveTreeBuilder(preorder, inorder, 0, inorder.length);
    }

    public TreeNode recursiveTreeBuilder(int[] preorder, int[] inorder, 
            int left_inorder_index, int right_inorder_index) {

        if (left_inorder_index == right_inorder_index) // Terminating condition
            return null;

        int node_val = preorder[preorder_index];
        preorder_index++;

        TreeNode root = new TreeNode(node_val);
        int index = index_lookup.get(node_val);
        // Invoke for left subtree and right subtree
        root.left = recursiveTreeBuilder(preorder, inorder, left_inorder_index, index);
        root.right = recursiveTreeBuilder(preorder, inorder, index + 1, right_inorder_index);
        return root;
    }
}
