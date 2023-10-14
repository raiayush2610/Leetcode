class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int n=s.length();
        HashSet<Character> set = new HashSet<>();
        int i=0;
      for(int j=0;j<s.length();j++){

          if(!set.contains(s.charAt(j))){
              set.add(s.charAt(j));
              l=Math.max(l,j-i+1);
          }else{
              while(set.contains(s.charAt(j))){
                  set.remove(s.charAt(i));
                      i++;
                }
               set.add(s.charAt(j));
            }
        }
        return l;
    }
}