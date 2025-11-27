class ReverseString {
   // LeetCode: 344 Reverse String
   // https://leetcode.com/problems/reverse-string/
   // Dry run with "hello"
    public void reverseString(char[] s) {
        int i = 0, 
            j = s.length -1;
        while(i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
        
    }

    // T.C: O(N)
    // S.C: O(1)

}