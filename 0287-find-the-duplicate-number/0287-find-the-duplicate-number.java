class Solution {
    public int findDuplicate(int[] nums) {
       Set<Integer> set =new HashSet<>();
       int len = nums.length;
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return len;
    }
}