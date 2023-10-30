public class Solution {
    public int sol(int[] nums1, int[] nums2, int index, int swapped,int dp[][]) {
        if (index == nums1.length) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int prev1 = nums1[index - 1];
        int prev2 = nums2[index - 1];
        if(dp[index][swapped]!= -1){
            return dp[index][swapped];
        }

        // Swapped
        if (swapped==0) {
            int temp = prev1;
            prev1 = prev2;
            prev2 = temp;
        }

        // No swap
        if (nums1[index] > prev1 && nums2[index] > prev2) {
            ans = sol(nums1, nums2, index + 1, 1,dp);
        }

        // Swapped
        if (nums1[index] > prev2 && nums2[index] > prev1) {
            ans = Math.min(ans, 1 + sol(nums1, nums2, index + 1,0,dp));
        }
        dp[index][swapped]= ans;

        return dp[index][swapped];
    }

    public int minSwap(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int[] nums1Extended = new int[nums1.length + 1];
        System.arraycopy(nums1, 0, nums1Extended, 1, nums1.length);
         nums1Extended[0] = -1;

        int[] nums2Extended = new int[nums2.length + 1];
        System.arraycopy(nums2, 0, nums2Extended, 1, nums2.length);
         nums2Extended[0] = -1;
          int dp [][]= new int [n+1][2];
          for(int i=0;i<n+1;i++){
              Arrays.fill(dp[i],-1);
          }
        
        

        int swapped = 1;
        return sol(nums1Extended, nums2Extended, 1, swapped,dp);
    }
}
