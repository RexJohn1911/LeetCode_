class Solution {
public:
    int commonFactors(int a, int b) {
        int ans=0;
        int x=0;
        if(a<b){
            x=a;
        }
        else{
            x=b;
        }
        for(int i=1;i<=x;i++){
            if(a%i==0 && b%i==0){
                ans++;
            }
        }
        return ans;
    }
};