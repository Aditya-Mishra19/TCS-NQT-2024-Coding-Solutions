#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int mSum = 0;
    for (int i = 1; i <= n; i++) {
        mSum += n * i;
    }
    cout << mSum << endl;
    return 0;
}
