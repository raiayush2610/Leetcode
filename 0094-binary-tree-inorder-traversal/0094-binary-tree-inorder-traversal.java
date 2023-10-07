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
   List<Integer> al = new ArrayList<>();
     
    public List<Integer> inorderTraversal(TreeNode root) {
        trav(root);
        return al;
    }
    private  void trav(TreeNode root){
        if(root==null){
            return;
        }
        trav(root.left);
        al.add(root.val);
        trav(root.right);
    }
}