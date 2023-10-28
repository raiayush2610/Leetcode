class Solution {
    public int longestSubsequence(int[] arr, int difference) {
         int n = arr.length;
        Map<Integer, Integer> dp = new HashMap<>();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int current = arr[i];
            int previous = current - difference;
            int tempAns = 0;

            if (dp.containsKey(previous)) {
                tempAns = dp.get(previous);
            }

            dp.put(current, 1 + tempAns);
            ans = Math.max(ans, dp.get(current));
        }

        return ans;
    }
}