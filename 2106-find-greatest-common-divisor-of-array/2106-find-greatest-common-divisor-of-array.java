class Solution {
    public  int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    public int findGCD(int[] nums) {
      int smallest =Integer.MAX_VALUE;
         int largest = Integer.MIN_VALUE;
        for(int i= 0;i<nums.length;i++ ){
            smallest=Math.min(nums[i],smallest);
            largest= Math.max(nums[i],largest);

        }
       return gcd(smallest,largest);
    }
}