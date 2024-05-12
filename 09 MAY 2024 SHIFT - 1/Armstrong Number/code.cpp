#include <iostream>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

bool isArmStrongNumber(int n, int k) {
    int sum = 0;
    int originalNum = n;
    while (originalNum > 0) {
        int digit = originalNum % 10;
        sum += pow(digit, k);
        originalNum /= 10;
    }
    return sum == n;
}

int main() {
    string input;
    cout << "Enter numbers separated by commas: ";
    getline(cin, input);
    vector<string> arr;
    size_t pos = 0;
    while ((pos = input.find(',')) != string::npos) {
        arr.push_back(input.substr(0, pos));
        input.erase(0, pos + 1);
    }
    arr.push_back(input);
    int flag = 0;
    for (string num_str : arr) {
        int num = stoi(num_str);
        int n = num_str.length();
        if (isArmStrongNumber(num, n)) {
            cout << num << " ";
            flag = 1;
        }
    }
    if (flag == 0) {
        cout << "No Armstrong numbers present";
    }
    return 0;
}
