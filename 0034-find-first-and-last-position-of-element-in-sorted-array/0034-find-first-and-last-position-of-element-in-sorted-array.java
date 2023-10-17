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
        int start = 0;
        int end= nums.length-1;
        int index= -1;
        
        while(start<=end){
        int mid =  end+(start-end)/2;

            if(nums[mid]==target){
                index= mid;
                if(find){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if (nums[mid]<target){
                start=mid +1;
            }else{
                end =mid -1;
            }
        }
        return index;
    }
}