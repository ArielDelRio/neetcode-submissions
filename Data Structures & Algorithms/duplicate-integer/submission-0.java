class Solution {
    public boolean hasDuplicate(int[] nums) {
         // define hashset to store unique values
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // if the set already contains the value, return true
            if (set.contains(nums[i])) {
                return true;
            }
            // add the value to the set
            set.add(nums[i]);

        }

        return false;
    }
}