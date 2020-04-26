package tiku;

public class leetcode112 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        System.out.println( hasPathSum(root,1));
    }
    public static boolean hasPathSum(TreeNode root, int sum) {
        return find(root,sum,0);
    }
    public static boolean find(TreeNode root,int sum,int count){
        if(root==null){
            return false;
        }
       if(root.left==null&&root.right==null){
           count=count+root.val;
           if(count==sum){
               return true;
           }else{
               return false;
           }
       }else{
           count=count+root.val;
           return find(root.left,sum,count)||find(root.right,sum,count);
       }
    }
}
