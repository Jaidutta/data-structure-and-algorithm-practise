#include <iostream>
#include <cmath>
using namespace std;


void reverseRecursion(long long n) {
    // Base Case: from your image "if n == 0 return"
    if (n == 0) {
        return;
    }

    // "lastDigit = n % 10"
    int lastDigit = n % 10;
    
    // "print Math.abs(lastDigit)"
    // We use abs just in case the platform tests negative numbers
    cout << abs(lastDigit);

    // "call the function with (n / 10)"
    reverseRecursion(n / 10);
}

int main() {
    long long n;
    
    // Read input
    if (!(cin >> n)) return 0;

    // Edge Case 1 from your image: "if n == 0, print 0 and return"
    if (n == 0) {
        cout << 0 << endl;
        return 0;
    }

    // Logic for negative numbers from your image
    if (n < 0) {
        cout << "-";
        n = -n; // Make it positive to process digits
    }

    reverseRecursion(n);
    cout << endl;

    return 0;
}