#include <iostream>
using namespace std;

int fibonacci(int n) {
    int a = 0, b = 1;
    if (n < 0) {
        cout << "Incorrect input" << endl;
        return -1; // or any error code you prefer
    } else if (n == 0) {
        return a;
    } else if (n == 1) {
        return b;
    } else {
        for (int i = 2; i <= n; ++i) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

int main() {
    int n;
    cin >> n;
    cout << fibonacci(n) << endl;
    return 0;
}
