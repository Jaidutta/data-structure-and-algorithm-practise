class Solution {
public:
    bool isPalindrome(int n) {
     return n == reversedNum(n);
    }

    private: long reversedNum(long n) {
        long  reverse = 0; 

        while(n > 0) {
            long lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        return reverse;
    }
};