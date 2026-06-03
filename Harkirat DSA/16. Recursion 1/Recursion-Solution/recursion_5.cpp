#include <iostream>
using namespace std;

// C --> B --> A --> C --> B --> A --> C --> B --> A --> C --> B --> A and so on, infinite loop, will cause stack overflow since there is no base case to stop the recursion
void A()
{
    cout << "I am in function A" << endl;
    C();
}

void B()
{
    cout << "I am in function B" << endl;
    A();
}

void C()
{
    cout << "I am in function C" << endl;
    B();
}

int main()
{
    C();
}