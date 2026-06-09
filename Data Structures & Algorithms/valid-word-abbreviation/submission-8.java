class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wIndex = 0;
        int abbrIndex = 0;

        while (wIndex < word.length() && abbrIndex < abbr.length()) {
            char wordChar = word.charAt(wIndex);
            char abbrChar = abbr.charAt(abbrIndex);

            if (Character.isLetter(abbrChar)) {
                if (wordChar != abbrChar) {
                    return false;
                }
                wIndex++;
                abbrIndex++;
            } else {
                if (abbrChar == '0') {
                    return false;
                }
                int num = 0;
                while (abbrIndex < abbr.length() && Character.isDigit(abbr.charAt(abbrIndex))) {
                    num = num * 10 + (abbr.charAt(abbrIndex) - '0');
                    abbrIndex++;
                }
                wIndex += num;
            }
        }
        return wIndex == word.length() && abbrIndex == abbr.length();
    }
}