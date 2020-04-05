package com.springmvc.leetcode.tiku;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class leetcode02 {
    public static void main(String[] args) {


    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode2=null;
        ListNode p=null;
        ListNode listNode=null;

        int jin=0;
        for(;l1!=null&&l2!=null;l1=l1.next,l2=l2.next){
            if(p==null){
                listNode=p=new ListNode((l1.val+l2.val+jin)%10);
            }else{
                p=p.next=new ListNode((l1.val+l2.val+jin)%10);
            }

            jin=(l1.val+l2.val+jin)/10;
        }



        if(l1==null&&l2==null){
            if(jin!=0){
                p.next=new ListNode(jin);
            }

        }
        if(l1==null&&l2!=null){
            for(;l2!=null;l2=l2.next){
                p=p.next=new ListNode((l2.val+jin)%10);
                jin=(l2.val+jin)/10;
            }
            if(jin!=0){
                p.next=new ListNode(jin);
            }
        }
        if(l2==null&&l1!=null){
            for(;l1!=null;l1=l1.next){
                p=p.next=new ListNode((l1.val+jin)%10);
                jin=(l1.val+jin)/10;
            }
            if(jin!=0){
                p.next=new ListNode(jin);
            }
        }
        return  listNode;
    }
}
