#include <iostream>
#include <vector>
#include <sstream>
using namespace std;

vector<int> input_array_format() {
    vector<int> arr;
    string input;
    getline(cin, input);
    stringstream ss(input);
    char c;
    while (ss >> c) {
        if (c != ',' || c != '[' or c != ']') {
            int num;
            ss >> num;
            arr.push_back(num);
        }
    }
    return arr;
}

vector<int> input_space_separated() {
    vector<int> arr;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int num;
    while (ss >> num) {
        arr.push_back(num);
    }
    return arr;
}

vector<int> input_comma_separated() {
    vector<int> arr;
    string input;
    getline(cin, input);
    stringstream ss(input);
    char c;
    while (ss >> c) {
        if (isdigit(c)) {
            int num;
            ss >> num;
            arr.push_back(num);
        }
    }
    return arr;
}

vector<int> input_array_size_not_given() {
    vector<int> arr;
    string input;
    getline(cin, input);
    stringstream ss(input);
    int num;
    while (ss >> num) {
        arr.push_back(num);
    }
    return arr;
}

int main() {
    // Case 1: [1,2,3,4,5]
    vector<int> arr1 = input_array_format();
    cout << "Case 1: [1,2,3,4,5]" << endl;
    for (int num : arr1) {
        cout << num << " ";
    }
    cout << endl;

    // Case 2: 1 2 3 4 5
    vector<int> arr2 = input_space_separated();
    cout << "Case 2: 1 2 3 4 5" << endl;
    for (int num : arr2) {
        cout << num << " ";
    }
    cout << endl;

    // Case 3: 1,2,3,4,5
    vector<int> arr3 = input_comma_separated();
    cout << "Case 3: 1,2,3,4,5" << endl;
    for (int num : arr3) {
        cout << num << " ";
    }
    cout << endl;

    // Case with size not given
    vector<int> arr4 = input_array_size_not_given();
    cout << "Case with size not given" << endl;
    for (int num : arr4) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
