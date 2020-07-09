/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool btreeGameWinningMove(TreeNode* root, int n, int x) {
        //traverse in all 3 directions left, right and top
        //if x==top then only traverse in left and right
        int left_count=0, right_count=0, top_count=0;
        if(x==1)
        {
            dfscount(root->left, left_count);
            dfscount(root->right, right_count);
            if((left_count>(n/2)) || (right_count>(n/2)))
            {
                 return true;  
            }
        }
        else
        {
            TreeNode* node = findNode(root,x);
            if(node!=NULL)
            {
                //cout<<node->val<<endl;
                dfscount(node->left, left_count);
                dfscount(node->right, right_count);
                top_count = n-1-left_count-right_count;
                top_count = max(top_count,left_count);
                top_count = max(top_count,right_count);
 
                if(top_count>n/2)
                {
                    return true;
                }
            }
        }
        return false;
    }
   
    TreeNode* findNode(TreeNode* root, int x)
    {
        TreeNode* result = NULL;
        if(root!=NULL)
        {
            int val = root->val;
            //cout<<val<<endl;
            //if(((2*val) == x) || ((2*val +1) == x))
            if(val==x)
            {
                return root;
            }
            result=findNode(root->left, x);
            if(result==NULL)
            {
                result=findNode(root->right,x);
            }
        }
        return result;
    }
    void dfscount(TreeNode* root, int& count)
    {
        TreeNode* curr = root;
        if(curr!=NULL)
        {
            dfscount(curr->left,count);
            count+=1;
            dfscount(curr->right,count);
        }
    }
};