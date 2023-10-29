class Solution {
    public int poorPigs(int buckets, int minToDie, int minToTest) {
        int mt = minToTest/minToDie+1;
        int reqpig=0;
        while(Math.pow(mt,reqpig)<buckets){
            ++reqpig;
        }
        return reqpig;
    }
}