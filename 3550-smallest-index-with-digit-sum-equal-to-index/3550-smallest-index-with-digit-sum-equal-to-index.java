class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sum(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
    public int sum(int a){
        int ans=0;
        while(a!=0){
            int digit=a%10;
            ans+=digit;
            a/=10;
        }
        return ans;
    }
}