#include <iostream>
using namespace std;

// recursion function calling itself 
void f(int n) {
  if (n == 0) {
    return;
  }
  f(n-1);
  cout << n << endl;
}
int main() {
    int n;
    cin >> n;
    f(n); // infinite loop, will cause stack overflow since there is no base case to stop the recursion
    return 0;
}