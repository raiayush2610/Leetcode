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
    public boolean isSame(TreeNode l ,TreeNode r){
        if( l == null && r ==null){
            return true;
        }
       if(l!= null && r==null){
           return false;
       }
       if(l ==null && r!=null){
           return false;
       }
       boolean leftS= isSame(l.left ,r.right);
       boolean rightS= isSame(l.right ,r.left);
       boolean value= l.val ==r.val;

        return (leftS && rightS && value);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root== null){
            return true;
        }
        return isSame(root.left,root.right);
    }
}