class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int len=length(head);
        if(k==len){
            return head;
        }
        else if(k>len){
            k=k%len;
        }
        for(int i=0;i<k;i++){
            head=rotate(head);
        }
        return head;
    }
    private int length(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    private ListNode rotate(ListNode head){
        ListNode tail=head;
        ListNode temp=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        tail.next=head;
        temp.next=null;
        head=tail;
        return head;
    }
}