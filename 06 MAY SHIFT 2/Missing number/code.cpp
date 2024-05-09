#include <iostream>
#include <vector>
#include <sstream>

using namespace std;

int getMissingNumIntFormat(vector<int>& arr, int size) {
    int totalSum = 0;
    int n = size + 1;
    for (int num : arr) {
        totalSum += num;
    }
    int actualSum = (n * (n + 1)) / 2;
    return actualSum - totalSum;
}

int getMissingNumStrFormat(vector<string>& arr, int size) {
    int totalSum = 0;
    int n = size + 1;
    for (auto str : arr) {
        int num = stoi(str); // Convert string to integer using stoi
        totalSum += num;
    }
    int actualSum = (n * (n + 1)) / 2;
    return actualSum - totalSum;
}




void input_space_separated() {
    cout << "\nEnter space-separated elements: ";
    int N; 
    cin >> N;
    cin.ignore(); 
    string input;
    getline(cin, input);
    stringstream ss(input);
    int num;
    vector<int> arr;
    while (ss >> num) { 
        arr.push_back(num);
    }
    cout << "Missing number: " << getMissingNumIntFormat(arr, N) << endl;
}


void input_array_format() {
    cout << "\nEnter elements in format e1,e2,e3: ";
    string input;
    int N; cin >> N;
    cin.ignore(); 
    getline(cin, input);
    stringstream ss(input);
    string token;
    vector<string> arr;
    while (getline(ss, token, ',')) {
        arr.push_back(token);
    }
    cout << "Missing number: " << getMissingNumStrFormat(arr, N) << endl;
}

int main() {
    input_space_separated();
    input_array_format();
    return 0;
}
