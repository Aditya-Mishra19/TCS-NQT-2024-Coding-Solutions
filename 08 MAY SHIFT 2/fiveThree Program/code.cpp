#include <bits/stdc++.h>

using namespace std;

void solve(vector<string>& arr) {
    stringstream result;
    for (auto n : arr) {
        int num = stoi(n);
        if (num % 3 == 0 && num % 5 == 0) {
            cout << "ThreeFive " << " ";
        } else if (num % 5 == 0) {
            cout << "Five "<< " ";
        } else if (num % 3 == 0) {
            cout << "Three "<< " ";
        } else {
            cout << num << " ";
        }
    }
}

void input_array_format1() {
    int n; cin >> n;
    cin.ignore(); 
    string input;
    getline(cin, input);
    input.erase(remove(input.begin(), input.end(), '['), input.end()); // Remove '['
    input.erase(remove(input.begin(), input.end(), ']'), input.end()); // Remove ']'
    stringstream ss(input);
    vector<string> arr1;
    string element;
    while (ss >> element) { // Read elements separated by space
        arr1.push_back(element);
    }
    solve(arr1); // Print the result
}

int main() {
    input_array_format1();
    return 0;
}
