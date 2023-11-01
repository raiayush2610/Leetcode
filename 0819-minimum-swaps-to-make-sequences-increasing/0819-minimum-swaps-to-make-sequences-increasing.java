class Solution {
    public int minSwap(int[] nums1, int[] nums2) {
      
    int n = nums1.length;

    // Create two arrays to store the minimum swaps needed up to the current index
    int[] keep = new int[n];
    int[] swap = new int[n];

    // Initialize the arrays
    keep[0] = 0;
    swap[0] = 1;

    for (int i = 1; i < n; i++) {
        // Initialize keep and swap values for the current index
        keep[i] = Integer.MAX_VALUE;
        swap[i] = Integer.MAX_VALUE;

        // Check if swapping at the current index is needed for both arrays
        if (nums1[i] > nums1[i - 1] && nums2[i] > nums2[i - 1]) {
            // If we swap at i, we need to consider the minimum swaps at i-1 for both keep and swap
            swap[i] = Math.min(swap[i], swap[i - 1] + 1);
            keep[i] = Math.min(keep[i], keep[i - 1]);
        }

        if (nums1[i] > nums2[i - 1] && nums2[i] > nums1[i - 1]) {
            // If we swap at i, we need to consider the minimum swaps at i-1 for both keep and swap
            swap[i] = Math.min(swap[i], keep[i - 1] + 1);
            keep[i] = Math.min(keep[i], swap[i - 1]);
        }
    }

    // The result should be the minimum of the last elements of keep and swap arrays
    return Math.min(keep[n - 1], swap[n - 1]);
 
    }
}