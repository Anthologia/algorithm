#include <iostream>
using namespace std;

void primeFactorization(int x) {
    for (int i = 2; i <= x; i++) {
        if (x % i == 0) {
            cout << i << endl;
            primeFactorization(x / i);
            return ;
        }
    }
    return ;
}

int main() {
    int n;
    cin >> n;

    primeFactorization(n);
    return 0;
}