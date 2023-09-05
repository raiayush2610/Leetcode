class Solution {
    public boolean isMonotonic(int[] nums) {
       int size= nums.length;
        boolean inc = true;
        boolean dec = true;
        for (int i=0; i<size-1;i++){
            if(nums[i] <nums[i+1]){
                dec= false;
            }
            if(nums[i]>nums[i+1]){
                inc= false;
            }
        }
        return inc|| dec;
    }
}