class Solution {
    public int maxPower(String s) {
        
     int streak =1,max=1;
        for(int i=1; i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                streak++;
            }else{
                streak=1;
            }
            max =Math.max(streak,max);
        }
        return max;
    }
}