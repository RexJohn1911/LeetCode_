class Solution {
    private ListNode head;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count=0;
        int a=0;
        ListNode temp_1=l1;
        ListNode temp_2=l2;
        while(temp_1!=null && temp_2!=null){
            count=temp_1.val+temp_2.val+a;
            a=0;
            if(count>9){
                a=0;
                int digit=count%10;
                insertLast(digit);
                a=count/10;
            }
            else{
                insertLast(count);
            }
            temp_1=temp_1.next;
            temp_2=temp_2.next;
        }
        while(temp_1!=null){
            count=temp_1.val+a;
            if(count>9){
                int q=count%10;
                insertLast(q);
                a=count/10;
            }
            else{
                insertLast(count);
                a=0;
            }
            temp_1=temp_1.next;
        }
        while(temp_2!=null){
            count=temp_2.val+a;
            if(count>9){
                int r=count%10;
                insertLast(r);
                a=count/10;
            }
            else{
                insertLast(count);
                a=0;
            }
            temp_2=temp_2.next;
        }
        if(a!=0){
            insertLast(a);
        }
        return head;
    }
    private ListNode insertLast(int val){
        ListNode newnode=new ListNode(val);
        if(head==null){
            head=newnode;
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
}