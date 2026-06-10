class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (n > 0 && m > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            } else {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }
        }

        while (n > 0) {
            nums1[n - 1] = nums2[n - 1];
            n--;
        }
    }
}

// [10, 20, 21, 0, 0, 0]
// [8, 12, 22]

// m = 3-- = 2-- = 1
// n = 3-- = 2-- = 1 -- = 0

// [_, 10, 12, 20, 21, 22]