#include <bits/stdc++.h>

using namespace std;

void printAllCombinations(vector<string> arr) {
    for (int i = 0; i < arr.size(); ++i) {
        for (int j = 0; j <= i; ++j) {
            cout << arr[j];
            if (i < arr.size() - 1 || j < i) {
                cout << ",";
            }
        }
    }
    cout << endl;
}

int main() {
    string s;
    cout << "Enter space-separated numbers: ";
    getline(cin, s);
    istringstream iss(s);
    vector<string> l{istream_iterator<string>{iss}, istream_iterator<string>{}};
    printAllCombinations(vector<string>(l.begin() + 1, l.end()));
    return 0;
}
