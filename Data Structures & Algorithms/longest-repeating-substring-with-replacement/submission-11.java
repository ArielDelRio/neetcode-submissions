class Solution {
    public int characterReplacementOptimal(String s, int k) {
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

    public int characterReplacement(String s, int k) {
        int best = 0; // to save our longest valid substring
        int left = 0; // left pointer of the window
        HashMap<Character, Integer> freq = new HashMap<>(); // To map the frequency of characters

        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right); // character at right position
            
            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1); // update the frequency of rightChar
            
            // while window is not valid reduce the window moving left pointer and update the frequency of leftChar 
            while(!isValidWindow(right - left + 1, getMaxFreq(freq), k)) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }

            best = Math.max(best, right - left + 1);
        }

        return best;
    }

    private boolean isValidWindow(int windowSize, int maxFreq, int k) {
        return windowSize - maxFreq <= k;
    }

    private int getMaxFreq(HashMap<Character, Integer> freq) {
        int maxFreq = 0;
        for (int count : freq.values()) {
            maxFreq = Math.max(maxFreq, count);
        }

        return maxFreq;
    }

}
