class Solution {
public:
    int accountBalanceAfterPurchase(int a) {
        int digit=a%10;
        if(digit>=5){
            int b=10-digit;
            a+=b;
        }
        else{
            a=a-digit;
        }
        return 100-a;
    }
};