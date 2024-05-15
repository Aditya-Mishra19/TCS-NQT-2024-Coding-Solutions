#include <bits/stdc++.h>
using namespace std;

int subarraySum(vector<int>& arr, int k) {
    unordered_map<int, int> mpp;
    mpp[0] = 1;
    int preSum = 0, cnt = 0;
    for (int i = 0; i < arr.size(); ++i) {
        preSum += arr[i];
        int rest = preSum - k;
        cnt += mpp[rest];
        mpp[preSum] += 1;
    }
    return cnt;
}

int main() {
    string inputLine;
    getline(cin, inputLine);
    istringstream iss(inputLine);
    vector<int> arr;
    int number;
    while (iss >> number) {
        arr.push_back(number);
    }

    int k;
    cin >> k;

    int result = subarraySum(arr, k);
    cout << result << endl;

    return 0;
}
