class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head;
        ListNode modify=head.next;
        int sum=0;
        while(curr.next!=null){
            sum+=curr.val;
            if(curr.next==null || curr.next.val==0){
                modify.val=sum;
                modify.next=curr.next;
                modify=modify.next;
                sum=0;
            }
            curr=curr.next;
        }
        ListNode temp=head.next;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head.next;
    }
}