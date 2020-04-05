package com.springmvc.leetcode.hotproblem;

public class leetcode226 {

    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            TreeNode temp=root.right;
            root.right=root.left;
            root.left=temp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
