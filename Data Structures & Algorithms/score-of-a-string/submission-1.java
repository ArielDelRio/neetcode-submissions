class Solution {
    public int scoreOfString(String s) {
            int score = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i - 1);

            score += Math.abs((int) c1 - (int) c2);
        }

        return score;
    }
}