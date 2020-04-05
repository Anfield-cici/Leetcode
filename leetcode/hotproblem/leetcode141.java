package com.springmvc.leetcode.hotproblem;

public class leetcode141 {
    public static void main(String[] args) {
    }
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode l1=head;
        ListNode l2=head;

        if(l2.next!=null){
            l2=l2.next;
        }else{
            return false;
        }
        while(l1!=l2){
            if(l1.next!=null){
                l1=l1.next;
            }else{
                return  false;
            }
            if(l2.next!=null&&l2.next.next!=null){
                l2=l2.next.next;
            }else{
                return false;
            }
        }
   return true;

    }
}
