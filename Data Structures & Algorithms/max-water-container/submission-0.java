class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max = 0;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            // Calculate the current area
            int length = Math.min(heights[left], heights[right]);
            int breadth = right - left;
            int area = length * breadth;

            // Update the maximum area
            max = Math.max(max, area);

            // Move the pointer of the shorter line inward
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
