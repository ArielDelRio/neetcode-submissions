class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int current = 0;

        for (int num : nums) {
            if (num == 1) {
                current++;
                count = Math.max(count, current);
            } else {
                current = 0;
            }
        }
        return count;
    }
}