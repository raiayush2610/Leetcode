class Solution {
    public boolean isPower(int n){
         if(n==0){
             return false;
         }
         if(n==1){return true;}
         if((n%3==0 && isPower(n/3))){
             return true;
         }
         return false;
    }
    public boolean isPowerOfThree(int n) {
        return isPower(n);
    }
}