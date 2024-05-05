#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> arr(N);
    for (int i = 0; i < N; ++i) {
        cin >> arr[i];
    }
    sort(arr.begin(), arr.end());

    // Max values
    int emp1 = arr[N - 1];
    int emp2 = arr[N - 2];
    int emp3 = arr[N - 3];

    // Negative case
    int neg1 = arr[0];
    int neg2 = arr[1];

    cout << max(emp1 * emp2 * emp3, neg1 * neg2 * emp1) << endl;

    return 0;
}
