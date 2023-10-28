class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] je = jewels.toCharArray();
        int res = 0;
        for(int i = 0; i < stones.length(); i++){
            for(int j = 0; j < je.length; j++){
                if(je[j] == stones.charAt(i)){
                    res++;
                }
            }
        }
        return res;
    }
}