class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arrS = new int[26];
        int[] arrT = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            arrS[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++) {
            arrT[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(arrS, arrT);
    }
}
