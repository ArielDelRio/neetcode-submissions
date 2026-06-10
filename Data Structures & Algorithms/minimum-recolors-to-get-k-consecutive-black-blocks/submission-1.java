class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whites = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whites++;
            }
        }

        int result = whites;
        for (int right = k; right < blocks.length(); right++) {
            int left = right - k;
            if (blocks.charAt(left) == 'W') {
                whites--;
            }
            if (blocks.charAt(right) == 'W') {
                whites++;
            }
            result = Math.min(result, whites);
        }

        return result;
    }
}