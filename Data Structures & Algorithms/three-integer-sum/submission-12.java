class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] numss = nums;
        Arrays.sort(numss);
        int left = 0;
        int right = numss.length - 1;

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < numss.length; i++){
            left = i + 1;
            right = numss.length - 1;
            while(left < right){
                if(numss[left] + numss[right] + numss[i] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(numss[left]);
                    temp.add(numss[right]);
                    temp.add(numss[i]);
                    if(!ans.contains(temp)){
                        ans.add(temp);
                    }
                    left++;
                }else if(numss[left] + numss[right] + numss[i] > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }

        return ans;

    }
}
