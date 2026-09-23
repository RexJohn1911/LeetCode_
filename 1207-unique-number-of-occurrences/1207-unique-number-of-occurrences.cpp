class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int> freq;
        for(int i=0;i<arr.size();i++){
            freq[arr[i]]++;
        }
        unordered_map<int,int> map;
        for(auto it=freq.begin();it!=freq.end();it++){
            map[it->second]++;
        }
        for(auto it=map.begin();it!=map.end();it++){
            if((it->second)>1){
                return false;
            }
        }
        return true;
    }
};