class Solution {
    public int minSwap(int[] nums1, int[] nums2) {
         int n = nums1.length;
        int[] dp = new int[n];
        int[] swap = new int[n];
        
        dp[0] = 0;
        swap[0] = 1;
        
        for (int i = 1; i < n; i++) {
            dp[i] = swap[i] = n;
            
            if (nums1[i] > nums1[i - 1] && nums2[i] > nums2[i - 1]) {
                dp[i] = dp[i - 1];
                swap[i] = swap[i - 1] + 1;
            }
            
            if (nums1[i] > nums2[i - 1] && nums2[i] > nums1[i - 1]) {
                dp[i] = Math.min(dp[i], swap[i - 1]);
                swap[i] = Math.min(swap[i], dp[i - 1] + 1);
            }
        }
        
        return Math.min(dp[n - 1], swap[n - 1]);
    }
}