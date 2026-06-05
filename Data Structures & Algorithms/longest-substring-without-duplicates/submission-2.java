class Solution {
    public int lengthOfLongestSubstring(String s) {
  int longestSubstringCount = 0;
        LinkedHashSet<Character> currentSubstr = new LinkedHashSet<>();
        int left = 0;

        for (int r = 0; r < s.length(); r++) {

            while (currentSubstr.contains(s.charAt(r))) {
                currentSubstr.remove(s.charAt(left));
                left += 1;
            }
            currentSubstr.add(s.charAt(r));
            longestSubstringCount = Math.max(longestSubstringCount, r - left + 1);

        }

        return longestSubstringCount;
    }


 public String setToString(Set<Character> set) {
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        return sb.toString();
    }

    public String getLongString(String str1, String str2) {
        return str1.length() > str2.length() ? str1 : str2;
    }

}
