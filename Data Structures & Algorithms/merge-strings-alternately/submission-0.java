class Solution {
    public String mergeAlternately(String word1, String word2) {
           int longWordLength = Math.min(word1.length(), word2.length());
        StringBuilder mergedWord = new StringBuilder();

        for (int i = 0; i < longWordLength; i++) {
            mergedWord.append(word1.charAt(i));
            mergedWord.append(word2.charAt(i));
        }

        if (word1.length() > word2.length()) {
            mergedWord.append(word1.substring(word2.length(), word1.length()));
        } else {
            mergedWord.append(word2.substring(word1.length(), word2.length()));
        }

        return mergedWord.toString();
        
    }
}