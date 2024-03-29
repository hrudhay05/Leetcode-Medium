class LongestPalindromic5 {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String lps = "";
        int low = 0;
        int high = 0;
        for (int i = 0; i < s.length(); i++) {
            low = i;
            high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            String palindrome = s.substring(low + 1, high);
            if (palindrome.length() > lps.length()) {
                lps = palindrome;
            }

            low = i - 1;
            high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            palindrome = s.substring(low + 1, high);
            if (palindrome.length() > lps.length()) {
                lps = palindrome;
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        LongestPalindromic5 solution = new LongestPalindromic5();
        String s1 = "babad";
        System.out.println("Longest palindrome in '" + s1 + "': " + solution.longestPalindrome(s1));

        String s2 = "cbbd";
        System.out.println("Longest palindrome in '" + s2 + "': " + solution.longestPalindrome(s2));

        String s3 = "a";
        System.out.println("Longest palindrome in '" + s3 + "': " + solution.longestPalindrome(s3));

        String s4 = "ac";
        System.out.println("Longest palindrome in '" + s4 + "': " + solution.longestPalindrome(s4));
    }
}
