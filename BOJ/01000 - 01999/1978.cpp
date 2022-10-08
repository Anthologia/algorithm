#include<iostream>
using namespace std;
 
int prime(int x) {
   for (int i = 2; i < x; i++)
       if(x % i == 0) return 0;
   
   return 1;
}

int main(void) {
    int x, temp, cnt = 0;
    cin >> x;
    
    for (int i = 0; i < x; i++) {
        cin >> temp;
        if(prime(temp) && temp-1)  cnt++;
    }
    cout << cnt << endl;

    return 0;
}
