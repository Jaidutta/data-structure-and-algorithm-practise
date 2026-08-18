class Solution {
public:
    int reverseNumber(int n) {
        if(n == 0) return  0;
        int reversedNumber = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            n = n / 10;
        }
        return reversedNumber;
    }
};