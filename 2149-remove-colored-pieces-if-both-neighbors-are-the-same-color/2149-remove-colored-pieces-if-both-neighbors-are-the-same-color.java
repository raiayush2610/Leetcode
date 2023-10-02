class Solution {
    public boolean winnerOfGame(String colors) {
         Map<Character, Integer> map= new HashMap<>();
        map.put('A', 0);
        map.put('B', 0);
        
        for (int i = 0; i < colors.length(); i++) {
            char x = colors.charAt(i);
            int count = 0;
            
            while (i < colors.length() && colors.charAt(i) == x) {
                i++;
                count++;
            }
           
            map.put(x, map.get(x) + Math.max(count - 2, 0));
            i--;
        }

        return map.get('A') > map.get('B');
    }
}