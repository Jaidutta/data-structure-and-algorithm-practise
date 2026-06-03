#include <iostream>
using namespace std;

long long sumOfNNaturalNumbers(long long n) {
    if (n == 0) {
        return 0;
    }
    long long smallAns = sumOfNNaturalNumbers(n - 1);
    long long ans = n + smallAns;
    return ans;
}

// CRITICAL: This must be 'int', not 'long long'
int main() {
    long long n;
    // Safety check for competitive programming input
    if (!(cin >> n)) return 0;

    cout << sumOfNNaturalNumbers(n) << endl;
    return 0;
}