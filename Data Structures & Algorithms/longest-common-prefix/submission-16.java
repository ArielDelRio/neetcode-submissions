class Solution {
    // public String longestCommonPrefix(String[] strs) {
    //      for (int i = 0; i < strs[0].length(); i++) {
    //         for (String s : strs) {
    //             if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
    //                 return s.substring(0, i);
    //             }
    //         }
    //     }
    //     return strs[0];
    // }

      public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 0; i < prefix.length(); i++) {
            for (String word : strs) {
                if (  i == word.length() || word.charAt(i) != prefix.charAt(i) ) {
                    return prefix.substring(0, i );
                }
            }
        }

        return prefix;
    }
}