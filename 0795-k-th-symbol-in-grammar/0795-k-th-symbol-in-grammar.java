class Solution {
  public int sol(int n,int k){
    if(n==0){
      return 0;
    }
    int num = sol(n-1,k/2);
    if(k%2==0){
      return num;
    }else{
      if(num==1){
        return 0;
      }else{
        return 1;
      }
    }
  }
    public int kthGrammar(int n, int k) {
        return sol(n-1,k-1);
    }
}