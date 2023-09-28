class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int result[] = new int [nums.length];
        int even =0;
        int odd= nums.length-1;
        for(int num : nums){
            if(num % 2 == 0){
                result[even] = num;
                even++;
            }
            else{
                result[odd]= num;
                odd--;
            }
        }
        return result;


        

    }
}