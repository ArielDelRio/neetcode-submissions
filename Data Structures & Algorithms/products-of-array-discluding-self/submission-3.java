class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] l = new int[length];
        int[] r = new int[length];
        int[] out = new int[length];

        l[0] = r[length - 1] = 1;
        // create accumulative from left to right
        for (int i = 1; i < length; i++) {
            l[i] = l[i - 1] * nums[i - 1];
        }

        // create accumulative from right to left
        for (int i = length - 2; i >= 0; i--) {
            r[i] = r[i + 1] * nums[i + 1];
        }

        // multiply accumulative right to left and left to right to get complete
        // Products
        for (int i = 0; i < out.length; i++) {
            out[i] = l[i] * r[i];
        }

        return out;
                    
    }
}  
