#include<iostream>
using namespace std;

int main()
{
    long long number;
    
    cin >> number;

   
    for(long long i = 1; i <= number; i *= 2)
    {
        cout << i << " ";
    }
    return 0;
}