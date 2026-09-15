class Solution {
public:
    int maxVowels(string s, int k) {
        int maxi=0;
        int x=0;
        for(int i=0;i<k;i++){
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'){
                maxi++;
            }
        }
        x=maxi;
        for(int i=k;i<s.length();i++){
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'){
                x++;
            }
            if(s[i-k]=='a' || s[i-k]=='e' || s[i-k]=='i' || s[i-k]=='o' || s[i-k]=='u'){
                x--;
            }
            maxi=max(x,maxi);
        }
        return maxi;
    }
};