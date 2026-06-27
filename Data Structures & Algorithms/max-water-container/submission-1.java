class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = left + 1;

        int maxArea = 0;

        while(left != heights.length - 1){
            int effectiveHeight = 0;
            if(heights[left] < heights[right]){
                effectiveHeight = heights[left];
            }else{
                effectiveHeight = heights[right];
            }
            // int effectiveHeight = heights[left] < heights[right] ? left : right;
            int currentArea = effectiveHeight * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            right++;
            
            if(right == heights.length){
                left++;
                right = left + 1;
            }

        }

        return maxArea;

    }
}
