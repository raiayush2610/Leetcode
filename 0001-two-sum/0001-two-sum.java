class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] intArray = new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j= 1; j<nums.length;j++){
                 if(nums[i]+nums[j]== target && i!= j){
                    intArray[0] = i;
                    intArray[1] = j;
                }
            }
               
        }
        return intArray;
    }
}