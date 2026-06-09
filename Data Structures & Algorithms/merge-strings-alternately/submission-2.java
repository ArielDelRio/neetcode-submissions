class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedWord = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if (i < word1.length()) {
                mergedWord.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                mergedWord.append(word2.charAt(i));
            }
        }
        return mergedWord.toString();
    }
}