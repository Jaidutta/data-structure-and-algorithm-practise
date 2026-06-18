#include <iostream>
#include <string>

using namespace std;

long long setBit(long long N, int i) {
    long long mask = 1LL << i;
    return (N | mask);
}

int main() {
    string binary; 
    cin >> binary;

    long long decimal = 0;
    int i = 0; 

    for (int j = binary.length() - 1; j >= 0; j--) {
        if (binary[j] == '1') {
            decimal = setBit(decimal, i);
        }
        i++; 
    }

    cout << decimal << endl;
    return 0;
}