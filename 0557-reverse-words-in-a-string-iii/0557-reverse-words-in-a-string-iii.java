class Solution {
    public String reverseWords(String s) {
       String[] words = s.split(" ");
        StringBuilder ans = new  StringBuilder();
      // StringBuilder as = new  StringBuilder();
        for (String word : words) {
            ans.append(new StringBuilder(word).reverse()).append(" ");
        
        }
        return ans.toString().trim();
    }
}