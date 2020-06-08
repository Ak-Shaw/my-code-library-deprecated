import java.io.*;
import java.util.*;

class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode next;

//    TreeNode () {}

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
        next = null;
    }

    public static Vector<TreeNode> readTreeFromEdges(int n,Vector<Integer> value, Vector<Vector<Integer> > edges)
    {
        Vector<TreeNode > nodes= new Vector<TreeNode>();
        for(int i=0;i<n;i++)
        {
            TreeNode temp = new TreeNode(value.get(i+1));
            nodes.add(temp);
        }
        for(Vector<Integer> edge: edges)
        {
            int parent = edge.get(0);
            int leftchild = edge.get(1);
            int rightchild = edge.get(2);
            if(leftchild != -1)
                nodes.get(parent - 1).left = nodes.get(leftchild - 1);
            if(rightchild != -1)
                nodes.get(parent - 1).right = nodes.get(rightchild - 1);
        }
        return nodes;
    }

    public static Vector<TreeNode> readTree(Scanner sc)
    {
        // IO
        int n;
        n=sc.nextInt();
        Vector<Integer> value=new Vector<Integer>();
        value.add(-1);
        for (int i = 1; i <= n; i++)
            value.add(sc.nextInt());
        Vector<Vector <Integer> > edges= new Vector<Vector<Integer> >();
        for(int i=0;i<n;i++)
        {
            Vector<Integer> temp=new Vector<Integer>();
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            edges.add(temp);
        }
        return readTreeFromEdges(n,value,edges);
    }

    //when using this pass a scanner object as parameter which takes system.in stream.
    public static Vector<TreeNode> readTreeReturnAllNodes(Scanner sc)
    {
        Vector<TreeNode> nodes = readTree(sc);
        return nodes;
    }

    public static TreeNode readTreeReturnRoot(Scanner sc)
    {
        Vector<TreeNode> nodes = readTree(sc);
        TreeNode root = nodes.get(0);
        return root;
    }
}


public class FindNumberOfBtVoilations  {

    int numberOfVoilations = 0;

    static TreeNode rootOfTree;

    int findNumberOfBtVoilations(TreeNode root) {
        
        if (root == null) {
            return 0;
        }

        else {

            int lDepth = findNumberOfBtVoilations(root.left);
            int rDepth = findNumberOfBtVoilations(root.right);

            int heightDiff = Math.abs(lDepth - rDepth);

            if (heightDiff > 1) {
                numberOfVoilations++;
            }

            if (rootOfTree == root) {
                return numberOfVoilations;
            }

            if (lDepth > rDepth) {
                return (lDepth + 1);
            } else {
                return (rDepth + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root  = TreeNode.readTreeReturnRoot(sc);
        rootOfTree = root;
        int numberOfVoilations = new FindNumberOfBtVoilations().findNumberOfBtVoilations(root);
        System.out.println(numberOfVoilations);
    }
}