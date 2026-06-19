class Solution {
   public int numUniqueEmails(String[] emails) {
        HashSet<String> simpleEmails = new HashSet<>();

        for (String email : emails) {
            String simpleEmail = getSimpleEmail(email);
            simpleEmails.add(simpleEmail);
        }
        return simpleEmails.size();
    }

    public String getSimpleEmail(String email) {
        StringBuilder simpleEmail = new StringBuilder();
        boolean inDomain = false;

        for (int i = 0; i < email.length(); i++) {
            char current = email.charAt(i);

            if (!inDomain && current == '.') {
                continue;
            }

            if (current == '+') {
                while (current != '@' && i < email.length()) {
                    i++;
                    current = email.charAt(i);
                }
            }

            if (current == '@') {
                inDomain = true;
            }

            simpleEmail.append(current);
        }

        return simpleEmail.toString();
    }
}