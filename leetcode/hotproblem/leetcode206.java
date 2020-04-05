package com.springmvc.leetcode.hotproblem;

import java.util.List;

public class leetcode206 {

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        ListNode l=listNode;
        l=l.next=new ListNode(2);
        l=l.next=new ListNode(3);
        l=l.next=new ListNode(4);
        l=l.next=new ListNode(5);
        reverseList(listNode);

    }
    public static ListNode reverseList(ListNode head) {
        if(head!=null){
            reverseList(head.next);
            System.out.println(head.val);
        }
        return head;

    }
}
