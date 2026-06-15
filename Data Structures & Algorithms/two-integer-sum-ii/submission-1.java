class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based index
            } else if (sum < target) {
                left++; // Move left pointer right to increase sum
            } else {
                right--; // Move right pointer left to decrease sum
            }
        }

        // Return an empty array or handle no solution case as needed
        return new int[]{-1, -1}; // Indicates no solution
    }
}
