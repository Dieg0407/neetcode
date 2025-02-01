package com.dieg0407.twopointers;

/**
 * ref: https://neetcode.io/problems/is-palindrome
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!isAlphanumeric(s.charAt(i))) {
                i++;
                continue;
            }
            if (!isAlphanumeric(s.charAt(j))) {
                j--;
                continue;
            }

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    private boolean isAlphanumeric(int character) {
        return (character >= 48 && character <= 57) ||
                (character >= 65 && character <= 90) ||
                (character >= 97 && character <= 122);
    }
}
