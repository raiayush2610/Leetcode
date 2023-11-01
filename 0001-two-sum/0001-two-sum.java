class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr [] = {0,0};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            // If the complement is in the HashMap, return the indices
            return new int[]{map.get(complement), i};
        }
        // Otherwise, add the current number and its index to the HashMap
        map.put(nums[i], i);
    }
    return arr;
    }
}