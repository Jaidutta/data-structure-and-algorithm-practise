#include<iostream>
using namespace std;

int main() {
  long long number;
  cin >> number;
  long long current = 1;

  while (current <= number) {
    current *= 2;
  }
  current /= 2;

  while(number > 0) {
    if (current <= number) {
      cout << current << " ";
      number -= current;
    }
    current /= 2;
  } 
  return 0;
}