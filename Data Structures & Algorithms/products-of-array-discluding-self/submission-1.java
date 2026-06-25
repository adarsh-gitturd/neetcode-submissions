class Solution {
    int[] ans;
    int[] numss;

    public int[] productExceptSelf(int[] nums) {
        ans = new int[nums.length];
        numss = nums;

        for(int i = 0; i < nums.length; i++){
            ans[i] = product(i);
        }

        return ans;
    }
    
    int product(int skip){
        int x = 1;
        for(int i = 0; i < numss.length; i++){
            if(i != skip){
                x *= numss[i];
            }
        }
        return x;
    }
    
}  
