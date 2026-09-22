class Solution {
    public boolean isThree(int n) {
        int a=(int) Math.sqrt(n);
        if(a*a!=n){
            return false;
        }
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                return false;
            }
        }
        return a>1;
    }
}