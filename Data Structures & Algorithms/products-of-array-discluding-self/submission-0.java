class Solution {
    public int[] productExceptSelf(int[] nums) {
        int acc = 1;
        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        int[] out = new int[nums.length];


        //  create accumulative from left to right
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                l[0] = 1;
            }
            else {
                l[i] = acc * nums[i - 1];
                acc = l[i];
            }
        }

        //  create accumulative from right to left
        acc = 1; // reset acc
        for (int i = nums.length -1 ; i >= 0; i--) {
            if(i == nums.length -1) {
                r[nums.length -1] = 1;
            }
            else {
                r[i] = acc * nums[i + 1];
                acc = r[i];
            }
        }

        // multiply accumulative right to left and left to right to get complete Products
        for (int i = 0; i < out.length; i++) {
            out[i] = l[i] * r[i];
        }

        return out;
                    
    }
}  
