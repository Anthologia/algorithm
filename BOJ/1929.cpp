#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int m, n;
    cin >> m >> n;

    bool prime[n+1];

    prime[0] = false;
    prime[1] = false;
    for (int i = 2; i <= n; i++)
        prime[i] = true;
    
    for (int i = 2; i <= sqrt(n); i++) {
        if (prime[i] == false)
            continue;
        
        for (int j = i * i; j <= n; j += i)
            prime[j] = false;
    }

    for (int i=m; i <= n; i++) {
        if (prime[i])
            cout << i << " ";
    }

    return 0;
}