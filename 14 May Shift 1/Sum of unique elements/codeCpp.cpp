#include <iostream>
#include <unordered_map>
#include <vector>
#include <sstream>

using namespace std;

int main() {
    string input;
    getline(cin, input);
    stringstream ss(input);
    vector<int> nums;
    int num;
    while (ss >> num) {
        nums.push_back(num);
    }
    unordered_map<int, int> d;
    for (int i = 0; i < nums.size(); ++i) {
        if (d.find(nums[i]) == d.end()) {
            d[nums[i]] = 1;
        } else {
            d[nums[i]]++;
        }
    }
    int ans = 0;
    for (auto it: d) {
        if (it.second == 1) {
            ans += it.first;
        }
    }
    cout << ans << endl;
    return 0;
}
