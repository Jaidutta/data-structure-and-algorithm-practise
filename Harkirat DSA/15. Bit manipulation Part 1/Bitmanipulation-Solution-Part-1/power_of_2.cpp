#include<iostream>
using namespace std;
#define int long long

signed main() {
  int number;
  cin >> number;
  int number2 = number -1;
  if(number > 0 &&(number & number2) == 0) {
    cout << "YES";
  } else {
    cout << "NO";
  }  
  return 0;
}