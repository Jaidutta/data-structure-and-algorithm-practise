class Solution {
public:
    int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        int ans = 1;
        for(int i = 2; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
};
