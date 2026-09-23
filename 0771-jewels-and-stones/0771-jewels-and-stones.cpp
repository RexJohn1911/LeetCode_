class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        int count=0;
        unordered_map<char,int> map;
        for(int i=0;i<jewels.length();i++){
            map[jewels[i]]++;
        }
        for(int i=0;i<stones.length();i++){
            if(map.count(stones[i])){
                count++;
            }
        }
        return count;
    }
};