#include<iostream>
using namespace std;

long long pow(int x, long n) {
    if (n == 0) {
        return 1;
    }
    long long smallAns = pow(x, n - 1);
    long long ans = x * smallAns;
    return ans;
}
int main() {
    long n;
    int x;

  
    if (!(cin >> x >> n)) return 0;
    cout << pow(x, n) << endl;
    return 0;
}