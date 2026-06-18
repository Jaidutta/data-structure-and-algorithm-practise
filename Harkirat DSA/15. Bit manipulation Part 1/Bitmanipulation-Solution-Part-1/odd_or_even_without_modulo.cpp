#include<iostream>
using namespace std;
#define int long long

int checkIthBit(int number, int i) {
    int mask = 1 << i; 
    return (mask & number) == 0 ? 0 : 1;
}
signed main() {
  int number;
  cin >> number;
  if(checkIthBit(number, 0) == 0) {
    cout << "Even";
  } else {
    cout << "Odd";
  }  
  return 0;
}