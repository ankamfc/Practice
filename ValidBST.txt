public class Solution {
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        
        boolean left = isValidBSTHelper(root.left, null, root);
        boolean right = isValidBSTHelper(root.right, root, null);
        
        return left && right;
    }
    
    public boolean isValidBSTHelper(TreeNode root, TreeNode min, TreeNode max) {
        if(root == null) return true;
        
        if(root.left != null && root.val < root.left.val) {
            return false;
        }
        if(root.right != null && root.val >= root.right.val) {
            return false;
        }
        if(min != null && root.val <= min.val) {
            return false;
        }
        if(max != null && root.val >= max.val) {
            return false;
        }
 
        boolean left = isValidBSTHelper(root.left, min, root);
        boolean right = isValidBSTHelper(root.right, root, max);
 
        return left && right;
    }
}