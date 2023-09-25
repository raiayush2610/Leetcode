class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0){
            return t.charAt(0);
        }
        HashMap<Character, Integer> mp1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mp2 = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            mp1.put(c,mp1.getOrDefault(c,0)+1);
            
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            mp2.put(c,mp2.getOrDefault(c,0)+1);
        }
        char ans = ' ';
        for(Map.Entry<Character, Integer>mp: mp2.entrySet()){
            char c = mp.getKey();
            int val = mp.getValue();
            if(!mp1.containsKey(c)){
                ans = c;
                break;
            }else if(mp1.containsKey(c) && mp1.get(c) != val){
                ans = c;
                break;
            }
        }
        return ans;
    }
}