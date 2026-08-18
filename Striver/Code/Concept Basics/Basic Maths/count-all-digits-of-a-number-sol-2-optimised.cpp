#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int countDigit(int n) {
       return int(log10(n)) + 1;
    }
};