#include<iostream>
using namespace std;
 
int main(void) {
    long a;
    int b, c;

    cin >> a >> b >> c;
    
    if (c - b > 0)
        cout << a / (c - b) + 1;
    else
        cout << -1;

    return 0;
}
