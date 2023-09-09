class Solution {
    public int reverse(int x) {
        boolean pos;
        Long rev =0L, rem;
        int max = (int)Math.pow(2, 31) - 1;
        int min = Integer.MIN_VALUE;
        
        
        if(x>0){
            pos=true;
            
            while(x!=0){
                rem=(long)x%10;

                rev=rev*10+rem;
                x=x/10;
                
            }
            
        }else{
            pos=false;
            x=x*(-1);
            while(x!=0){
                rem=(long)x%10;
                rev=rev*10+rem;
                x=x/10;
            }

        }
        if(rev >= max){
            return 0;
        }
        else if(rev<min){
            return 0;
        }
        else{
            return pos ?(rev).intValue():(rev.intValue()*(-1));
        }
        
        
    }
}
  