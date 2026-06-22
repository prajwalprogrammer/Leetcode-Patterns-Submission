class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int currPrice = prices[0];
        for(int i=0;i<prices.length;i++){
            maxPro = Math.max(maxPro, prices[i] - currPrice);
            currPrice = Math.min(currPrice, prices[i]);
        }
        return maxPro;
    }
}
