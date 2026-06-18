#include<iostream>
using namespace std;

int checkIthBit(int number, int i) {
    int mask = 1 << i; 
    return (mask & number) == 0 ? 0 : 1;
}
int main()
{
    int n;
    cin >> n;

    for (int i = 30; i >= 0; i--)
    {
        if(checkIthBit(n, i) == 1) {
            cout << 1;
        }
        else {
            cout << 0;
        }
    }

    return 0;
}