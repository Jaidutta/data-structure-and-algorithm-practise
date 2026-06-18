#include<iostream>
using namespace std;
#define int long long

int checkIthBit(int number, int i) {
  int mask = 1LL << i;
  return ((number & mask) == 0) ? 0: 1;

}

int setBit(int number, int i) {
  int mask = 1LL << i;
  return (number | mask);
}

signed main() {
  int arraySize;
  cin >> arraySize;
  int arr[arraySize];
  for(int i = 0; i < arraySize; i++) {
    cin >> arr[i];
  }
  int ans = 0;
  for(int j = 0; j < 64; j++) {
    int sum = 0;

    for(int i = 0; i < arraySize; i++) {
      if(checkIthBit(arr[i], j) == 1) {
        sum++;
      }
    }

    if(sum % 3 != 0) {
      ans = setBit(ans, j);
    }
  }
  cout << ans << endl;
  return 0;
}