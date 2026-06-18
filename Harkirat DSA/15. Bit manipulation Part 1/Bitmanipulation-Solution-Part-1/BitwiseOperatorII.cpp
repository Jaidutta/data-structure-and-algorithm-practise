#include<iostream>
using namespace std;

#define int long long
signed main()
{
    int araySize;
    cin >> araySize;

    int arr[araySize];
    for(int i = 0; i < araySize; i++)
    {
        cin >> arr[i];
    }

    int andResult = arr[0];
    for(int i = 1; i < araySize; i++)
    {
        andResult &= arr[i];
    }

    int orResult = 0;
    for(int i = 0; i < araySize; i++)
    {
        orResult |= arr[i];
    }

    int xorResult = 0;
    for(int i = 0; i < araySize; i++)
    {
        xorResult ^= arr[i];
    }

    cout << andResult << " " << orResult << " " << xorResult << endl;
    return 0;
}