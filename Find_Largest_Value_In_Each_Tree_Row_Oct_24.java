package leetcode.binarySearch.daily_challenge;

import java.util.ArrayList;
import java.util.List;

public class Find_Largest_Value_In_Each_Tree_Row_Oct_24 {
    public class TreeNode{
        TreeNode(){

        }

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val  = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

     public List<Integer> largestValues(TreeNode root) {
        List<Integer> largerVals = new ArrayList<>();
        helper(root,largerVals,0);
        return largerVals;
    }

    public void helper(TreeNode root,List<Integer> largerVals,int levels){
        if(root == null) return;

        if(largerVals.size() == levels) largerVals.add(root.val);
        else largerVals.set(levels,Math.max(largerVals.get(levels),root.val));

        helper(root.left,largerVals,levels+1);
        helper(root.right,largerVals,levels+1);
    }
}
