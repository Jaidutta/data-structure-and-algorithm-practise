class ValidPalindrome {
    // https://leetcode.com/problems/valid-palindrome/
    // 125. Valid Palindrome

    // Do the dry run with apap & apa
    public boolean ValidPalindrome(String s) {
        int i = 0,
            j = s.length() - 1;
        while(i < j) {
            char leftCharacter = s.charAt(i);
            char rightCharacter = s.charAt(j);

            if(!Character.isLetterOrDigit(leftCharacter)) {
                i++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(rightCharacter)) {
                j--;
                continue;
            }

            if(Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}