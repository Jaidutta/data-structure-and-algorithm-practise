#include<iostream>
using namespace std;
#define int long long 

signed main() {
  int arraySize;
  cin >> arraySize;
  int arr[arraySize];
  for(int i = 0; i < arraySize; i++) {
    cin >> arr[i];
  }

  int ans = 0;
  for(int x: arr) {
    ans ^= x;
  }
  cout << ans << endl;
  return 0;
}
