class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftmax=0;
        int rightmax=0;
        for( int  i : left ){
            leftmax= Math.max(leftmax,i);
        }
         for( int  j : right){
            rightmax= Math.max(rightmax,n-j);
        }
        return Math.max(leftmax,rightmax);
    }
}