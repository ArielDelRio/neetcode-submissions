class Solution {
    public int appendCharacters(String s, String t) {
        int sIndex = 0;
        for (int i = 0; i < t.length(); i++) {
            boolean found = false;
            for (int j = sIndex; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    sIndex = j + 1;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return t.length() - i;
            }
        }
        return 0;
    }
}