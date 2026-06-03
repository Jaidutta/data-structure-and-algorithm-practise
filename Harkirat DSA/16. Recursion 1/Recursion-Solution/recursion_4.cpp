#include <iostream>
using namespace std;

void A()
{
    cout << "I am in function A" << endl;
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