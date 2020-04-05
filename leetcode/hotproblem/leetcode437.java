package com.springmvc.leetcode.hotproblem;

public class leetcode437 {
    static int count=0;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode t=root.left=new TreeNode(5);
      t=t.left=new TreeNode(3);
        TreeNode r=t.right=new TreeNode(-2);
        t=t.left=new TreeNode(3);
        System.out.println(pathSum(root,8));
    }

    public static int pathSum(TreeNode root, int sum) {
        if(root==null)
            return 0;
        int total=0;
        int count=0;
        sum(root,sum,0,0);
        return count;

    }
    public static void sum(TreeNode root,int sum,int total,int count){

    }
}
