#include<iostream>
#include<vector>
using namespace std;

#define int long long

int checkBit(int mask, int i) {
    int bitmask = 1LL << i;
    return ((mask & bitmask) == 0) ? 0 : 1;
}

signed main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N;
    cin >> N;
    
    int A[N];
    for(int i = 0; i < N; i++) {
        cin >> A[i];
    }
   
    
    for(int mask = 1; mask < (1LL << N); mask++) {
        for(int i = 0; i < N; i++) {
            if(checkBit(mask, i) == 1) {
                cout << A[i] << " ";
            }
        }
        cout << "\n"; 
    }

    return 0;
}