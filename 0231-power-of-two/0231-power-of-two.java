class Solution {
     public boolean isPower(int n){
         if(n==0){
             return false;
         }
         if(n==1){return true;}
         if((n%2==0 && isPowerOfTwo(n/2))){
             return true;
         }
         return false;
     }
    public boolean isPowerOfTwo(int n) {
        return isPower(n);
    }
}