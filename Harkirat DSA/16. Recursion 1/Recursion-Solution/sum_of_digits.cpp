#include<iostream>
using namespace std;

long long sumOfDigits(long long n) {
    if (n == 0) {
        return 0;
    }
    long long smallAns = sumOfDigits(n / 10);
    long long ans = smallAns + (n % 10);
    return ans;
}

int main() {
    long long n;

    if (!(cin >> n)) return 0;
    cout << sumOfDigits(n) << endl;
    return 0;
}