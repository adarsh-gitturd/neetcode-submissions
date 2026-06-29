class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; 
        int right = 1;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            while(right <= prices.length-1){
                if(prices[right] - prices[left] > 0){
                    maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                }
                right++;
            }
            left++;
            right = left + 1;
        }

        return maxProfit;
    }
}
