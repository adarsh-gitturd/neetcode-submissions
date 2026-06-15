class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        int left = prices[0];
        int right = 1;
        while(right < n){
            if(left > prices[right]){
                left = prices[right];
                right++;
            }else{
                maxProfit = Math.max(maxProfit, prices[right] - left);
                right++;
            }
        }

        
        return maxProfit;
    }
}

