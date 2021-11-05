#include <iostream>
#include <cmath>
#define MAX 246913
using namespace std;

int main() {
    bool prime[MAX];
    fill_n(prime, MAX, true);

    prime[0] = false;
    prime[1] = false;
    
    for (int i = 2; i <= sqrt(MAX); i++) {
        if (prime[i])
            for (int j = i * 2; j <= MAX; j += i)
                prime[j] = false;
    }

    while (true) {
        int n, sum = 0;
        cin >> n;
        if (n == 0) break;
        
        for (int i=n+1; i <= 2*n; i++)
            if (prime[i]) sum++;

        cout << sum << endl;
    }

    return 0;
}
