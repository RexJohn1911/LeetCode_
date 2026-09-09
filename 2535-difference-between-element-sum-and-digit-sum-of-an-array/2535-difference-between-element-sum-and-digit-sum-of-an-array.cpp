class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int num1=0;
        int num2=0;
        for(size_t i=0;i<nums.size();i++){
            num1+=nums[i];
            int temp=nums[i];
            while(temp>0){
                num2+=(temp%10);
                temp/=10;
            }
        }
        return num1-num2;
    }
};