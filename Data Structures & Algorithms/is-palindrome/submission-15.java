class Solution {

// Input: s = "tab a bat"
// left = 0
// right = 8

            // System.out.println(right);

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left <= right) {
            while(left < s.length() && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while(right  >= 0 && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if(left < right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }


        return true;
        
    }

}
