#include<iostream>
using namespace std;
#define int long long 

signed main() {
  int count = 0;
  int number;
  cin >> number;
  while(number != 0) {
    count++;
    number = number & (number - 1);
  }
  cout << count << endl;
}