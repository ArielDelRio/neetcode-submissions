class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            String key = Arrays.toString(freq);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(word);
            map.put(key, list);
        }

        return new ArrayList<>(map.values());
    }
}
