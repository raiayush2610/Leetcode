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
    public boolean isSame(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }else if(p== null ||  q==null  || p.val!= q.val ){
            return false;
        }
        if(!isSame(p.left,q.left)){
            return false;
        }
        if(!isSame(p.right,q.right)){
            return false;
        }
        return true;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
         return isSame(p,q);
    }
}