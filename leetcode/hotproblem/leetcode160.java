package com.springmvc.leetcode.hotproblem;



public class leetcode160 {

    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        while (headA != headB) {
            if(headA.next!=null){
                headA=headA.next;
            }else{
                return null;
            }
            if(headB.next!=null){
                headB=headB.next;
            }else{
                return null;
            }
        }
        return headA;
    }
}
