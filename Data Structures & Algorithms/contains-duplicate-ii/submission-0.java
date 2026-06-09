class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Set seen = new HashSet<Integer>();
        int leftWindow = 0;

        for (int rightWindow = 0; rightWindow < nums.length; rightWindow++) {
            if (seen.contains(nums[rightWindow])) {
                return true;
            }

            seen.add(nums[rightWindow]);

            if (seen.size() - 1 == k) {
                seen.remove(nums[leftWindow]);
                leftWindow++;
            }
        }

        return false;
    }
}