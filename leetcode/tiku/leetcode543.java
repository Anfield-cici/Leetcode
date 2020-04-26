package tiku;

public class leetcode543 {
    public static void main(String[] args) {
        TreeNode t=new TreeNode(1);
        TreeNode tt=t;
        tt.left=new TreeNode(2);
        tt.right=new TreeNode(3);
        System.out.println(diameterOfBinaryTree(t));
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        int deepleft=0;
        int deepright=0;
        if(root==null){
            return 0;
        }

        deepleft=deep(root.left);
        deepright=deep(root.right);
        int zhijing=deepleft+deepright;
        int left=Math.max(zhijing,diameterOfBinaryTree(root.left));
        int right=Math.max(zhijing,diameterOfBinaryTree(root.right));
        return left>right?left:right;
    }

    public static int deep(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=deep(root.left);
        int right=deep(root.right);
        return left>right?left+1:right+1;
    }

}
