class Solution {
public:
    int maxFreqSum(string s) {
        int maxV=0;
        int maxC=0;
        unordered_map<char,int> freq;
        for(int i=0;i<s.length();i++){
            freq[s[i]]++;
        }
        for(auto it:freq){
            if(it.first=='a' || it.first=='e' || it.first=='i' || it.first=='o' || it.first=='u'){
                if(maxV<(it.second)){
                    maxV=it.second;
                }
            }
            else{
                if(maxC<(it.second)){
                    maxC=it.second;
                }
            }
        }
        return maxV+maxC;
    }
};