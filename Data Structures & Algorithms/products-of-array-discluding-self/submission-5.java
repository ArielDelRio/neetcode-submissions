class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];


        int pref = 1;
        prefix[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = pref * nums[i-1];
            pref = pref * nums[i-1];
        }

        int suff = 1;
        suffix[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suff * nums[i+1];
            suff = suff * nums[i+1];
        }

        for(int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}  

// pref=2
// [1,2,4,6]
// [1,1,2,8]

// suff=6
// [ 1, 2,4,6]
// [48,24,6,1]

// [48, 24, 12, 8]