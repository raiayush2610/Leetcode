class Solution {
    public String largestPalindromic(String num) {
         Map<Integer, Integer> map = new HashMap<>();
        for (char c : num.toCharArray()) {
            map.merge((int) c - (int) '0', 1, Integer::sum);
        }
        final int[] number = {0};
        final String[] strings = {"", ""};
        StringBuilder end = new StringBuilder();
        map.forEach((key, value) -> {
            if (value % 2 == 1)
                number[0] = Math.max(number[0], key);
            for (int i = 0; i < value / 2; i++) {
                end.append(key);
            }
        });
        if (end.lastIndexOf("0") == end.length() - 1)
            return String.valueOf(number[0]);
        StringBuilder start = new StringBuilder(end);
        start.reverse();
        if (end.length() * 2 == num.length()) {
            start.append(end);
            return start.toString();
        }
        start.append(number[0]);
        start.append(end);
        return start.toString();
    }
}