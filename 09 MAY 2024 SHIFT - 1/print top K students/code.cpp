#include <bits/stdc++.h>

using namespace std;

int main() {
    string s;
    getline(cin, s);
    vector<string> l;
    string token;
    istringstream iss(s);
    while (iss >> token) {
        l.push_back(token);
    }
    int k = stoi(l[0]);
    int N = stoi(l[1]);
    vector<pair<int, string>> arr;

    for (int i = 2; i < l.size(); i += 2) {
        int marks = stoi(l[i]);
        string name = l[i + 1];
        arr.push_back(make_pair(marks, name));
    }

    sort(arr.begin(), arr.end(), greater<pair<int, string>>());

    for (int top = 0; top < k && top < arr.size(); top++) {
        cout << arr[top].second << ": " << arr[top].first << endl;
    }

    return 0;
}
