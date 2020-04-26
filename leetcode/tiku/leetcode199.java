package tiku;

import java.util.ArrayList;
import java.util.List;

class Queue{
    int ceng;
    TreeNode treeNode;
}

public class leetcode199 {
    public static void main(String[] args) {
     Queue[] qu=new Queue[10];
     qu[0].ceng=10;
        System.out.println(qu[0].ceng);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        Queue[] q=new Queue[10];

        int front=0;
        int rear=0;
        int h=0;
        q[rear].ceng=h;
        q[rear].treeNode=root;
        rear=(rear+1)%10;

        while(front!=rear){
            Queue qu=new Queue();
            qu=q[front];
            TreeNode p=qu.treeNode;
            front=(front+1)%10;
            if(q[front]==null||qu.ceng!=q[front].ceng){
                list.add(p.val);
            }
            if(p.left!=null&&(rear+1)%10!=front){
                q[rear].ceng=qu.ceng+1;
                q[rear].treeNode=p.left;
                rear=(rear+1)%10;
            }
            if(p.right!=null&&(rear+1)%10!=front){
                q[rear].ceng=qu.ceng+1;
                q[rear].treeNode=p.right;
                rear=(rear+1)%10;
            }
        }
        return list;
    }
}
