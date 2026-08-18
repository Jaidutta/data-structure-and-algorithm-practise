#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int GCD(int n1,int n2) {
        int minN = min(n1, n2);
        int largest = 1;
        for(int i = 2; i <= minN; i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                if(i > largest) {
                    largest = i;
                }
            }
        }
        return largest;
    }
};