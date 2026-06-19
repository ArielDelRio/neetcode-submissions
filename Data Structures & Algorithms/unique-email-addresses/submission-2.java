class Solution {
   public int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for (String email : emails) {
            unique.add(normalize(email));
        }
        return unique.size();
    }

    private String normalize(String email) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (email.charAt(i) != '@') {
            char c = email.charAt(i);
            if (c == '+') {
                while (email.charAt(i) != '@') {
                    i++;
                }
                break;
            }
            if (c != '.') {
                sb.append(c);
            }
            i++;
        }

        sb.append(email.substring(i));
        return sb.toString();
    }
}