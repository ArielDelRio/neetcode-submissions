class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] out = new int[length];
        out[0] = 1;
        // create accumulative from left to right
        for (int i = 1; i < length; i++) {
            out[i] = out[i - 1] * nums[i - 1];
        }

        int R = 1;
        for (int i = length - 1; i >= 0; i--) {
            out[i] = out[i] * R;
            R = R * nums[i];
        }

        return out;
    }
}  
