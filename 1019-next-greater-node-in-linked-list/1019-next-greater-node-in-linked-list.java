class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int max=0;
        ListNode temp=head;
        int len=length(head);
        int[] ans=new int[len];
        int[] arr=new int[len];
        Arrays.fill(arr,0);
        for(int i=0;i<len;i++){
            ans[i]=temp.val;
            temp=temp.next;
        }
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(ans[i]<ans[j]){
                    arr[i]=ans[j];
                    break;
                }
            }
        }
        return arr;
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