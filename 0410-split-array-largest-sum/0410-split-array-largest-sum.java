class Solution {
    public int splitArray(int[] nums, int k) {
        int left=0,right=0;
        for(int num:nums){
            left=Math.max(num,left);
            right+=num;
        }
        while(left<right){
            int mid=left+(right-left)/2;
            if(canSplitArray(mid,nums,k)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public Boolean canSplitArray(int mid,int[] nums,int k){
        int subarray=1,total=0;
        for(int num:nums){
            total+=num;
            if(total>mid){
                total=num;
                subarray++;
            }
            if(subarray>k){
                return false;
            }
        }
        return true;
    }
}