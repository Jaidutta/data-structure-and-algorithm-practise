#include<iostream>
using namespace std;

int main()
{
    long long number;
    
    cin >> number;

    if (number == 0) {
        cout << 0 << "";
        return 0;
    }

    long long current = 1;
    while (current <= number) {
        current *= 2;
    }
    current /= 2;


    // this loop condition should depend on the current value, not the number itself as it will exit 
    // if the loop condition depends on the number and the number is reduced to 0 before the current value reaches 0, it will not print the remaining bits
    while(current > 0) {
        if (current <= number) {
            cout << 1 <<"";
            number -= current;
        }
        else {
            cout << 0 << "";
        }
        current /= 2;
    }
   

    return 0;
}