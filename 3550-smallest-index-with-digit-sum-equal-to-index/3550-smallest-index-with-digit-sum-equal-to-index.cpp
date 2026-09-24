class Solution {
public:
    int smallestIndex(vector<int>& nums) {
        for(int i=0;i<nums.size();i++){
            int a=nums[i];
            int ans=0;
            while(a!=0){
                int digit=a%10;
                ans+=digit;
                a/=10;
            }
            if(ans==i){
                return i;
            }
        }
        return -1;
    }
};