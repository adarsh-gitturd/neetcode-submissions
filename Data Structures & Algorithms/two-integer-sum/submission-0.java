class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> mapp = new HashMap<>();

        for(int i = 0; i < len; i++){
            int compl = target - nums[i];

            if(mapp.containsKey(compl)){
                return new int[]{mapp.get(compl), i};
            }
            mapp.put(nums[i], i);
        }

        return new int[]{};
    }
}
