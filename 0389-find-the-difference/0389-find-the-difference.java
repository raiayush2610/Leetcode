class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0){
            return t.charAt(0);
        }
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
            
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        char ans = ' ';
        for(Map.Entry<Character, Integer> mp: map2.entrySet()){
            char c = mp.getKey();
            int val = mp.getValue();
            if(!map1.containsKey(c)){
                ans = c;
                break;
            }else if(map1.containsKey(c) && map1.get(c) != val){
                ans = c;
                break;
            }
        }
        return ans;
    }
}