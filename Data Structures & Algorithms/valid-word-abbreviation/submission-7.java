class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
         int wIndex = 0;
        int abbrIndex = 0;
        String jumpingIndex = "";

        while (wIndex < word.length() && abbrIndex < abbr.length()) {
            char wordChar = word.charAt(wIndex);
            char abbrChar = abbr.charAt(abbrIndex);

            if (wordChar == abbrChar) {
                abbrIndex++;
            } else if (!Character.isDigit(abbrChar) || abbrChar == '0') {
                return false;
            } else {
                while (Character.isDigit(abbrChar) && abbrIndex < abbr.length()) {
                    jumpingIndex += abbrChar;
                    abbrIndex++;
                    if (abbrIndex < abbr.length()) {
                        abbrChar = abbr.charAt(abbrIndex);
                    }
                }
            }

            if (jumpingIndex.length() > 0) {
                wIndex += Integer.parseInt(jumpingIndex);
                jumpingIndex = "";
            } else {
                wIndex++;
            }
        }

        return wIndex == word.length() && abbrIndex == abbr.length();
    }
}