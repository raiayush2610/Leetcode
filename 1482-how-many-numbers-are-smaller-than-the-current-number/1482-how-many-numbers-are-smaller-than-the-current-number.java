class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = smNo(nums, i);
        }
        return res;
    }
    public int smNo(int[] a, int i){
        int count = 0;
        for(int j = 0; j < a.length; j++){
            if(j == i) continue;
            if(a[i] > a[j] ) count++;
        }
        return count;
    }
}