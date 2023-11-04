class Solution {
    public int countPrimes(int n) {
    int count = 0;
    boolean[] isPrime = new boolean[n];
          
    // Initialize the isPrime array to false
    for (int i = 0; i < n; i++) {
        isPrime[i] = false;
    }
    // Initialize the isPrime array to true
    for (int i = 2; i < n; i++) {
        isPrime[i] = true;
    }

 

      for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
                for(int j=2*i;j<n;j=j+i){
                    isPrime[j] =false;
                }
            }
        }
    return count;
    }

}