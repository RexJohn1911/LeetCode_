class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int i=0;
        for(i=0;i<costs.length;i++){
            count+=costs[i];
            if(coins<count){
                break;
            }
        }
        return i;
    }
}