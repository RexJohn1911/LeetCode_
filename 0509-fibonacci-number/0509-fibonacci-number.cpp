class Solution {
public:
    int fib(int n) {
        int a=1;
        int b=1;
        int c=1;
        if(n<=1){
            return n;
        }
        for(int i=0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
};