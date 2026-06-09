class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Index = 0;
        int word2Index = 0;
        StringBuilder mergedWord = new StringBuilder();
        int longWordLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < longWordLength; i++) {
            if (word1Index < word1.length()) {
                mergedWord.append(word1.charAt(word1Index));
                word1Index++;
            }

            if (word2Index < word2.length()) {
                mergedWord.append(word2.charAt(word2Index));
                word2Index++;
            }
        }

        return mergedWord.toString();
    }
}