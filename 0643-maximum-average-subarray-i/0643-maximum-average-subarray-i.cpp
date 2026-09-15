class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double x=0;
        double maxi=0;
        for(int i=0;i<k;i++){
            maxi+=nums[i];
        }
        x=maxi;
        for(int i=k;i<nums.size();i++){
            x+=nums[i];
            x-=nums[i-k];
            maxi=max(x,maxi);
        }
        return maxi/k;
    }
};