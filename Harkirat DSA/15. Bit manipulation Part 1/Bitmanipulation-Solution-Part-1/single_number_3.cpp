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
  
  int xor_arr = 0;
  for(int i = 0; i < arraySize; i++) {
    xor_arr ^= arr[i];
  }

  int pos = -1;
  for(int i = 0; i < 64; i++) { 
    if(checkIthBit(xor_arr, i) == 1) {
      pos = i;
      break; 
    }
  }

 
  int group1 = 0;
  int group2 = 0;
  for(int i = 0; i < arraySize; i++) {
    if(checkIthBit(arr[i], pos) == 1) {
      group1 ^= arr[i];
    } else {
      group2 ^= arr[i];
    }
  }

  if (group1 < group2) {
    cout << group1 << " " << group2 << "\n";
  } else {
    cout << group2 << " " << group1 << "\n";
  }
  return 0;
}