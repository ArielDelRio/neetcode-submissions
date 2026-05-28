class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        int[] out = new int[nums.length];
        
        l[0] = r[nums.length - 1] = 1;
        int acc = 1;
        // create accumulative from left to right
        for (int i = 1; i < nums.length; i++) {
            l[i] = acc * nums[i - 1];
            acc = l[i];
        }

        // create accumulative from right to left
        acc = 1; // reset acc
        for (int i = nums.length - 2; i >= 0; i--) {
            r[i] = acc * nums[i + 1];
            acc = r[i];
        }

        // multiply accumulative right to left and left to right to get complete
        // Products
        for (int i = 0; i < out.length; i++) {
            out[i] = l[i] * r[i];
        }

        return out;
                    
    }
}  
