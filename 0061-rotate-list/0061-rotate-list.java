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
        if(k==0){
            return head;
        }
        int br=len-k;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        ListNode temp=head;
        for(int i=1;i<br;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
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
}