class Solution {
    public boolean isAnagram(String s, String t) {
 if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> set = new HashMap<>();

        for (char c : s.toCharArray()) {
            set.put(c, set.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!set.containsKey(c) || set.get(c) == 0) {
                return false;
            }
            set.put(c, set.get(c) - 1);

        }
        return true;

    }
}
