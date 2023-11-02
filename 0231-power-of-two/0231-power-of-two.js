/**
 * @param {number} n
 * @return {boolean}
 */
var isPower = function(n){
    if(n== 1){
            return true;
        }
        if(n==0){
            return false;
        }
        if(n%2==0){
            if(isPower(n/2)){
                return true;
            }
        }
        return false;
} 
var isPowerOfTwo = function(n) {
     return isPower(n);
};