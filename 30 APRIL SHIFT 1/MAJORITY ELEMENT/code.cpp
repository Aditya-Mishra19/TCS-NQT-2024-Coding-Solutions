#include <bits/stdc++.h>
using namespace std;

void findMajorityElement(vector<int>& arr, int N) {
    unordered_map<int, int> freq;
    for (int num : arr) {
        freq[num]++;
    }
    for (auto& pair : freq) {
        if (pair.second >= N / 2) {
            cout << pair.first << " ";
        }
    }
}

int main() {
    int N;
    cin >> N;
    vector<int> array(N);
    for (int i = 0; i < N; ++i) {
        cin >> array[i];
    }
    findMajorityElement(array, N);
    return 0;
}
