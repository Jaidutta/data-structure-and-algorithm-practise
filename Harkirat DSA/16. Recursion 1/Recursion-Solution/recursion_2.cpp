#include <iostream>
using namespace std;

// recursion function calling itself 
void f(int n) {
    if (n == 0) {
        return;
    }
    cout << "Hello, World!" << endl;
    f(n - 1);
}
int main() {
    f(5); // will print "Hello, World!" 5 times
    return 0;
}