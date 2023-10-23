class Solution {
    public boolean isPower(int x){
      if(x==1){
        return true;
      }
    if(x == 0) return false;
      if(x%4!=0){
        return false;
      }
      if(isPower(x/4)){ return true;}
      return false;

    }
    public boolean isPowerOfFour(int n) {
        return isPower(n);
    }
}