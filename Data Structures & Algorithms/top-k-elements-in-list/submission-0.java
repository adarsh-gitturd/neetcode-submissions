class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mapp = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if(!mapp.containsKey(nums[i])){
                mapp.put(nums[i], 1);
            }else{
                int nf = mapp.get(nums[i]) + 1;
                mapp.put(nums[i], nf);
            }
        }
        
        /*
            1 - 1
            2 - 2
            3 - 3
        */

        int max = 0;
        int key = 0;
        int[] ans = new int[k];

        for(int i = 0; i < k; i++){
            for(Map.Entry<Integer, Integer> entry : mapp.entrySet()){
                if(entry.getValue() >= max){
                    max = entry.getValue();
                    key = entry.getKey();
                }
            }
            ans[i] = key;
            mapp.remove(key);
            max = 0;
        }

        return ans;
    }

    
}
