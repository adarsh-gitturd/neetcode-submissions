class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> sett = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            sett.add(nums[i]);
        }

        return sett.size() != nums.length;

    }
}
 