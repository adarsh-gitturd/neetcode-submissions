class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;

        for(int n : nums){
            set.add(n);
        }

        for(int n : nums){
            if(!set.contains(n-1)){
                int length = 1;
                int i = 1;
                while(set.contains(n+i)){
                    length++;
                    i++;
                }
                max = Math.max(max, length);
            }
        }

        return max;
    }
}
