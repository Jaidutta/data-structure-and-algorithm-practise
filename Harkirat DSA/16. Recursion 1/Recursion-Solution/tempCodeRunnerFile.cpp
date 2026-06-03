#include<iostream>
using namespace std;

long long pow(int x, long n) {
    if (n == 0) {
        return 1;
    }
    int smallAns = pow(x, n - 1);
    int ans = x * smallAns;
    return ans;
}
int main() {
    long n;
    int x;
    cin >> n;
    cin >> x;
    cout << pow(x, n) << endl;
    return 0;
}