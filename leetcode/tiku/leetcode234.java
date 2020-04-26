package tiku;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}


public class leetcode234 {
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        ListNode head=list;
        list.next=new ListNode(2);
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(slow.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=null;
        ListNode p=slow.next;
        while(p!=null){
           ListNode q=p.next;
           p.next=head2;
           head2=p;
           p=q;
        }

        while(head!=null&&head2!=null){
            if(head.val!=head2.val){
                return false;
            }
        }
        return true;

    }
}
