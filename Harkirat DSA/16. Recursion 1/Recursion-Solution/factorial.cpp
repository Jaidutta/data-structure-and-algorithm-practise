#include<iostream>
using namespace std;
long long factorial(long long n) {
    if (n == 0) {
        return 1;
    }
    long long smallAns = factorial(n - 1);
    long long ans = n * smallAns;
    return ans;
}

int main() {
    long long n;
    cin >> n;
    cout << factorial(n) << endl;
    return 0;
}