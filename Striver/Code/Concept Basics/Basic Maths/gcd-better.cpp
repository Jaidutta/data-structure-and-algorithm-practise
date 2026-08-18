#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int GCD(int n1,int n2) {
        int minN = min(n1, n2);
       
        for(int i = minN; i >= 1; i--) {
            if(n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
};