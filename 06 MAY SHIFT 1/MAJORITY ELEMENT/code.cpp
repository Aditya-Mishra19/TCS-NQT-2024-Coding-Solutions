#include <iostream>
#include <unordered_map>
#include <vector>
#include <sstream>

using namespace std;

void findMajorityElement(vector<string>& arr, int N) {
    unordered_map<string, int> freq;
    for (string& n : arr) {
        if (freq.find(n) != freq.end()) {
            freq[n]++;
        } else {
            freq[n] = 1;
        }
    }
    for (auto& it : freq) {
        if (it.second >= N / 3) {
            cout << it.first << " ";
        }
    }
}

void findMajorityElementInt(vector<int>& arr, int N) {
    unordered_map<int, int> freq;
    for (int& num : arr) {
        if (freq.find(num) != freq.end()) {
            freq[num]++;
        } else {
            freq[num] = 1;
        }
    }
    for (auto& it : freq) {
        if (it.second >= N / 3) {
            cout << it.first << " ";
        }
    }
}

void input_array_format() {
    cout << "\nEnter elements in format [e1,e2,e3]: ";
    string input;
    getline(cin, input);
    stringstream ss(input);
    string token;
    vector<string> arr;
    while (getline(ss, token, ',')) {
        arr.push_back(token);
    }
    findMajorityElement(arr, arr.size());
}

void input_space_separated() {
    cout << "\nCase 2: Enter space-separated elements: ";
    string input;
    getline(cin, input);
    stringstream ss(input);
    int num;
    vector<int> arr;
    while (ss >> num) {
        arr.push_back(num);
    }
    findMajorityElementInt(arr, arr.size());
}

int main() {
    input_array_format();
    input_space_separated();
    return 0;
}
