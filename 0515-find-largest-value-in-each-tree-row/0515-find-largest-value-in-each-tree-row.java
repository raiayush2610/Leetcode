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
  public void  dfs(TreeNode node ,int l,List<Integer> res){
    if(node==null){
      return;
    }
    if(l==res.size()){
      res.add(node.val);
    }else{
      res.set( l, Math.max(res.get(l),node.val));
    }
    dfs(node.left ,l+1,res);
    dfs(node.right,l+1,res);
  }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        if(root== null){
          return res;
        }
        dfs(root,0,res);
        return res;
    }
}