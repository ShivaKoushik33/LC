/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void fn(TreeNode root,List<Integer> ans){
         if(root==null){
            return ;
        }
        fn(root.left,ans);
        ans.add(root.val);
        fn(root.right,ans);
        // return ans;

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        // if(root==null){
        //     return l;
        // }
        // inorderTraversal(root.left);
        // l.add(root.val);
        // inorderTraversal(root.right);
        fn(root,l);
        return l;
    }
}