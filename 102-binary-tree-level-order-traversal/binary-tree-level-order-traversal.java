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
    List<List<Integer>> res = new LinkedList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return res;
        }    

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> tempRes = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode elem = q.remove();
                if(elem.left != null) {
                    q.add(elem.left);
                }
                if(elem.right != null) {
                    q.add(elem.right);
                }
                tempRes.add(elem.val);
            }
            res.add(tempRes);
        }

        return res;
    }
}