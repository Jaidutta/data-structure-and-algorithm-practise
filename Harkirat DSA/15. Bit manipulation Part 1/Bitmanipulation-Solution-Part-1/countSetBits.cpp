#include<iostream>
using namespace std;

#include<iostream>
using namespace std;

int checkIthBit(int number, int i) {
    int mask = 1 << i; 
    return (mask & number) == 0 ? 0 : 1;
}

int countSetBits(int n) {
    int totalSetBits = 0;
    for (int i = 0; i < 32; i++) {
        if (checkIthBit(n, i) == 1) {
            totalSetBits++;
        }
    }
    return totalSetBits;
}
int main()
{
    int n;
    cin >> n;

    cout << countSetBits(n) << endl;     

    return 0;
}

