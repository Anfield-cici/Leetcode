package tiku;

public class leetcode617 {
    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode p=t1;
        p.left=new TreeNode(2);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=null;
        mergeTrees(t1,t3);
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

}
