#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int m, n, min = 0, sum = 0;
    cin >> m >> n;

    bool prime[n + 1];
    fill_n(prime, n + 1, true);
    
    prime[0] = false;
    prime[1] = false;
    
    for (int i = 2; i <= sqrt(n); i++) {
        if (prime[i])
            for (int j = i + i; j <= n; j += i)
                prime[j] = false;
    }

    for (int i=m; i <= n; i++) {
        if (prime[i]) {
            if (min == 0) min = i;
            sum += i;
        }
    }

    if (sum == 0)
        cout << "-1" << endl;
    else
        cout << sum << endl << min << endl;

    return 0;
}