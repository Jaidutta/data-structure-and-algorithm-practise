#include<iostream>
using namespace std;

int nthFibonacci(int n) {
    if (n == 1) {
        return 0;
    }
    if (n == 2) {
        return 1;
    }
    int smallAns1 = nthFibonacci(n - 1);
    int smallAns2 = nthFibonacci(n - 2);
    int ans = smallAns1 + smallAns2;
    return ans;
}

int main() {
    int n;

    if (!(cin >> n)) return 0;
    cout << nthFibonacci(n) << endl;
    return 0;
} 