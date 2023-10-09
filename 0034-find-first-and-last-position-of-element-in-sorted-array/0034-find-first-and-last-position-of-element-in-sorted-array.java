class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans [] = {-1,-1};
        int last = findNumber(nums, target,true);
        int right = findNumber(nums, target,false);
        if(last<=right){
            return new int[] {last,right};
        }else{
            return new int[] {-1,-1};
        }
    }
    public int findNumber(int []nums, int  target,boolean find){
        int low = 0;
        int high= nums.length-1;
        int index= -1;
        
        while(low<=high){
        int mid =  high+(low-high)/2;

            if(nums[mid]==target){
                index= mid;
                if(find){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else if (nums[mid]<target){
                low=mid +1;
            }else{
                high =mid -1;
            }
        }
        return index;
    }
}