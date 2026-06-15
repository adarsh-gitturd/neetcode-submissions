class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setto = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            setto.add(nums[i]);
        }

        return !(setto.size() == nums.length);
    }
}
