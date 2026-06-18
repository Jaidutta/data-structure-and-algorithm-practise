#include<iostream>
using namespace std;

#define int long long
signed main()
{
    int a, b;
    cin >> a >> b;

    cout << (a & b)  << " " << (a | b)  << " " << (a ^ b) << endl;

    return 0;
}