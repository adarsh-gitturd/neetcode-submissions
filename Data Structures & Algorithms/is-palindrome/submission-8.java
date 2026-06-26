class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.toLowerCase();
        char[] c = ss.toCharArray();
        int left = 0;
        int right = c.length - 1;

        while(left <= right){
            
            while(left < right && !Character.isLetterOrDigit(c[left])){
                left++;
            }
            while(right > left && !Character.isLetterOrDigit(c[right])){
                right--;
            }
            if(!(c[left] == c[right])){
                return false;
            }else{
                left++;
                right--;
            }
        }

        return true;
    }
}
