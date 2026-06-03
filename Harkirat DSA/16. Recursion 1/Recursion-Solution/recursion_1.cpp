#include <iostream>
using namespace std;

// recursion function calling itself 
void f() {
    cout << "Hello, World!" << endl;
    f();
}
int main() {
    f(); // infinite loop, will cause stack overflow since there is no base case to stop the recursion
    return 0;
}