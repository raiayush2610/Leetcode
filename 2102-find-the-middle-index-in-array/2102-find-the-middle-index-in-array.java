class Solution {
    public int findMiddleIndex(int[] nums) {
        int l = nums.length;
        int [] right = new int [l];
        int [] left = new int [l];
        int  ans = 0;
        right[l-1]=nums[l-1];
        left[0]= nums[0];

        for(int i=1;i<l;i++){
            left[i]=left[i-1]+nums[i]; 
        }

        for(int i=l-2;i>=0;i--){
            right[i]=right[i+1]+nums[i];
        }

        for(int i=0;i<l;i++){
            if(left[i]==right[i]){
               return  i;
            }
        }

         return -1;
    }
}