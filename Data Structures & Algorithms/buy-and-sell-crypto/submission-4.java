class Solution {
    public int maxProfit(int[] prices) {

        // failed multiple times, tried chatgpt and ended up solving it on my own!! super proud

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

