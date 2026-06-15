class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        int longest = 0;

        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int count = 1;

            if(set.contains(n-1)){
                while(set.contains(n-1)){
                    count++;
                    n--;
                }
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}
 