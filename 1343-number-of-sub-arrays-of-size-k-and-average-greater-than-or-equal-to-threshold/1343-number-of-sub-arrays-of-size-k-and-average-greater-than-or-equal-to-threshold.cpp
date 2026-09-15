class Solution {
public:
    int numOfSubarrays(vector<int>& arr, int k, int tr) {
        double a=0;
        int ans=0;
        for(int i=0;i<k;i++){
            a+=arr[i];
        }
        if((a/k)>=tr){
            ans++;
        }
        for(int i=k;i<arr.size();i++){
            a+=arr[i]-arr[i-k];
            if((a/k)>=tr){
                ans++;
            }
        }
        return ans;
    }
};