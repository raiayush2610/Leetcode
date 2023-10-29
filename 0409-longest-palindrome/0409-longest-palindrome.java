class Solution {
    public int longestPalindrome(String s) {
         // Create a map to count the occurrences of each character.
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the occurrences of each character in the input string.
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOddCount = false;

        // Calculate the length of the palindrome.
        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                // If the count is odd, we can use all even occurrences and leave one character in the middle.
                length += count - 1;
                hasOddCount = true;
            }
        }

        // If there's at least one character with an odd count, add one to the length for the middle character.
        if (hasOddCount) {
            length++;
        }

        return length;
    
    
    }
}