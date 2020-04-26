package tiku;



public class leetcode23 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result=null;
        if(lists.length!=0){
            result=merge(lists,0,lists.length-1);
        }

        return result;
    }

    public ListNode merge(ListNode[] lists,int start,int end){
        int mid=(start+end)/2;
        if(start<end){
            lists[start]=merge(lists,start,mid);
            lists[mid+1]=merge(lists,mid+1,end);
        }
        ListNode p=lists[start];
        ListNode q=null;
        if(start==end){
            q=lists[start];
        }else if(start<end){
            q=lists[mid+1];
        }
        if(p!=q){
            lists[start]=null;
            ListNode t=null;
            ListNode l=null;
            while(p!=null&&q!=null){
                if(p.val>q.val){
                    l=q;
                    q=q.next;
                }else{
                    l=p;
                    p=p.next;
                }
                if(lists[start]==null){
                    lists[start]=t=l;
                }else{
                    t.next=l;
                    t=t.next;
                }
            }

            while(p!=null){
                if(lists[start]==null){
                    lists[start]=l=p;
                }else{
                    l.next=p;
                    l=l.next;
                }
                p=p.next;
            }
            while(q!=null){
                if(lists[start]==null){
                    lists[start]=l=q;
                }else{
                    l.next=q;
                    l=l.next;
                }
                q=q.next;
            }
        }
        return lists[start];
    }
}
