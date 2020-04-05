package com.springmvc.leetcode.hotproblem;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
public class leetcode101 {
    public static void main(String[] args) {

    }
    public static boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
       return  isSymmertric(root.left,root.right);
    }
    public static boolean isSymmertric(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null)
            return true;
        if(root1==null||root2==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return isSymmertric(root1.left,root2.right)&&isSymmertric(root1.right,root2.left);
    }



}
