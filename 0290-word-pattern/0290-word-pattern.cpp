class Solution {
public:
    bool wordPattern(string pattern, string s) {
        stringstream ss(s);
        vector<string> words;
        string word;
        while(ss>>word){
            words.push_back(word);
        }
        if(words.size()!=pattern.length()){
            return false;
        }
        unordered_map<string,char> map1;
        unordered_map<char,string> map2;
        for(int i=0;i<pattern.length();i++){
            string a=words[i];
            char c=pattern[i];
            if(map1.count(a) && map1[a]!=c){
                return false;
            }
            if(map2.count(c) && map2[c]!=a){
                return false;
            }
            map1[a]=c;
            map2[c]=a;
        }
        return true;
    }
};