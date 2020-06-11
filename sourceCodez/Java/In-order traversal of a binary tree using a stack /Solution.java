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

  public List<Long> inorderTraversal(TreeNode root) {

    List<Long> res = new ArrayList<>();

    Stack<TreeNode> stack = new Stack<>();

    TreeNode curr = root;

    while (curr != null || !stack.empty()) {

        while (curr != null) {

            stack.push(curr);

            curr = curr.left;
        }

        curr = stack.pop();

        res.add(curr.val);

        curr = curr.right;
    }

    return res;
  }
}