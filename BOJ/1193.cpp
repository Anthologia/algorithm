#include<iostream>
using namespace std;
 
int main(void) {
    int i, x, temp;
    int sum = 0;

    cin >> x;

    for (i = 1; i<=x; i++) {
        sum += i;
        if (sum >= x) break;
    }

    temp = x - (sum - i);

    if (i%2 == 0)
        cout << temp << "/" << i - temp + 1;
    else
        cout << i - temp + 1 << "/" << temp;

    return 0;
    
}
