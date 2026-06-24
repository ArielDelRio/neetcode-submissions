class Solution {
      public int characterReplacement(String s, int k) {
        int best = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);

            while ((right - left + 1) - getMaxFreq(freq) > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }

            best = Math.max(best, right - left + 1);
        }

        return best;
    }

    private int getMaxFreq(HashMap<Character, Integer> freq) {
        int maxFreq = 0;
        for (int count : freq.values()) {
            maxFreq = Math.max(maxFreq, count);
        }
        return maxFreq;
    }

}
