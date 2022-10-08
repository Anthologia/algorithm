#include <iostream>
using namespace std;
int w[101], v[101], dp[100001];

int main() {
    int n, k;
    cin >> n >> k;
    
    for (int i=0; i<n; i++)
        cin >> w[i] >> v[i];
    
    for (int i = 0; i < n; i++) {    
        for (int j = k; j - w[i] >= 0; j--)
            dp[j] = max(dp[j - w[i]] + v[i], dp[j]);
    }

    cout << dp[k];
    return 0;
}


