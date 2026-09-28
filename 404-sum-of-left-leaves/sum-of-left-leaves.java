class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);
    }
    private int sum(TreeNode root){
        int ans = 0;
        if(root == null) return 0;

        if(root.left != null && root.left.left == null && root.left.right == null){
            ans += root.left.val;
        }
        else {
            ans += sum(root.left);
        }
        ans += sum(root.right);

        return ans;
    }
}