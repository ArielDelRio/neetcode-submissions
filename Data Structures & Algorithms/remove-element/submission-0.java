class Solution {
    public int removeElement(int[] nums, int val) {
        Queue<Integer> stackValPositions = new ArrayDeque<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                stackValPositions.offer(i);
            }
            else if(!stackValPositions.isEmpty()) {
                int positionToUpdate = stackValPositions.poll();
                nums[positionToUpdate] = nums[i];
                stackValPositions.offer(i);
            }
        }

        System.out.println(nums);
        System.out.println(stackValPositions);

        return nums.length - stackValPositions.size();
    }
}

// nums=[0,1,2,2,3,0,4,2]
// val=2


// [0,1,3,0,4]