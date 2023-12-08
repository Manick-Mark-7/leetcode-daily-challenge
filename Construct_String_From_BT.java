package leetcode.binarySearch.daily_challenge;

//we are making the BT to String format.
// we are used Deapth First Search (DFS) for traversing the tree

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(){}
    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode(int val,TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Construct_String_From_BT {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root,sb);
        return sb.toString();
    }

    private void dfs(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append(String.valueOf(root.val));
        if (root.left == null && root.right == null) return;
        sb.append('(');
        dfs(root.left, sb);
        sb.append(')');
        if (root.right != null) {
            sb.append('(');
            dfs(root.right, sb);
            sb.append(')');
        }
    }
}
