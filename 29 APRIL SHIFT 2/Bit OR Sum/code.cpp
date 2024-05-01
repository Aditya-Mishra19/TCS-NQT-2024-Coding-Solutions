#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

int subarrayBitwiseORs(vector<int>& arr) {
    vector<int> res;
    int left = 0;
    for (int num : arr) {
        int right = res.size();
        res.push_back(num);
        for (int i = left; i < right; ++i) {
            int value = res[i] | num;
            if (res.back() != value) {
                res.push_back(value);
            }
        }
        left = right;
    }
    return unordered_set<int>(res.begin(), res.end()).size();
}

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }
    cout << subarrayBitwiseORs(arr) << endl;
    return 0;
}
