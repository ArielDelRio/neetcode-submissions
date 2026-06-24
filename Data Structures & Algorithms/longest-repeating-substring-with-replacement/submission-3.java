class Solution {
      public int characterReplacement(String s, int k) {
        int best = 0;
        int left = 0;
        int maxFreq = 0;
        HashMap<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(rightChar));
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

}
