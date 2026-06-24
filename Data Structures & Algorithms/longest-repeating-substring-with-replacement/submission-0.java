class Solution {
     public int characterReplacement(String s, int k) {
        int best = 0;
        int maxFreq = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j+1);

                maxFreq = getMaxFrequency(substring);

                if (substring.length() - maxFreq <= k) {
                    best = Math.max(best, substring.length());
                }
            }
        }

        return best;
    }

    public int getMaxFrequency(String s) {
        int maxFreq = 0;
        HashMap<Character, Integer> freq = new HashMap<>();

        for (Character character : s.toCharArray()) {
            freq.put(character, freq.getOrDefault(character, 0) + 1);
        }

        for (int count : freq.values()) {
            maxFreq = Math.max(maxFreq, count);
        }

        return maxFreq;

    }
}
