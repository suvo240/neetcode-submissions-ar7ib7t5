class Solution {
    public int maxProfit(int[] prices) {

        int max_profit=0;
        int i=0;
        int j=i+1;
        while(j<prices.length){
            if(prices[i]>=prices[j]){
                i=j;
                j++;
            } else {
                max_profit = Math.max(max_profit,prices[j]-prices[i]);
                j++;
            }

        }
        return max_profit;
    }
}
