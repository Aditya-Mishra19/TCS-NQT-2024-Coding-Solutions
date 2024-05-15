#include <iostream>
#include <vector>
#include <algorithm>
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
    int maxSum = nums[0];
    int currentSum = 0;
    for (int i = 0; i < nums.size(); ++i) {
        currentSum += nums[i];
        if (currentSum > maxSum) {
            maxSum = max(currentSum, maxSum);
        }
        if (currentSum < 0) {
            currentSum = 0;
        }
    }
    cout << maxSum << endl;
    return 0;
}
