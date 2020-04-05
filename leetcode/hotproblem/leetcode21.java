package com.springmvc.leetcode.hotproblem;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class leetcode21 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode p3=new ListNode(-1);
        ListNode p=p3;
        while(p1!=null&&p2!=null){
            if(p1.val>p2.val){
                p.next=p2;
                p2=p2.next;
            }else{
                p.next=p1;
                p1=p1.next;
            }
            p=p.next;
        }
        if(p1!=null){
            p.next=p1;
        }
        if(p2!=null){
            p.next=p2;
        }
        return p3.next;
    }
}
