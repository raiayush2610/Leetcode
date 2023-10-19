class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Check for empty inputs
    if (strs == null || strs.length == 0)
      return new ArrayList<>();

    Map<String, List<String>> fStrMap = new HashMap<>();
    for (String str : strs) {

      String fStr = getfStr(str);

      // If the frequency string is present, add the string to the list
      if (fStrMap.containsKey(fStr)) {
        fStrMap.get(fStr).add(str);
      }
      else {
        // else create a new list
        List<String> strList = new ArrayList<>();
        strList.add(str);
        fStrMap.put(fStr, strList);
      }
    }

    return new ArrayList<>(fStrMap.values());
    }
    private String getfStr(String str) {

    // Frequency buckets
    int[] freq = new int[26];

    // Iterate over each character
    for (char c : str.toCharArray()) {
      freq[c - 'a']++;
    }

    // Start creating the frequency string
    StringBuilder fStr = new StringBuilder("");
    char c = 'a';
    for (int i : freq) {
      fStr.append(c);
      fStr.append(i);
      c++;
    }

    return fStr.toString();
  }
}