#include <bits/stdc++.h>

using namespace std;

void printDictSorted(const map<string, int>& mydict, bool reverse = false) {
    vector<string> sorted_keys;
    for (const auto& entry : mydict) {
        sorted_keys.push_back(entry.first);
    }
    if (reverse) {
        sort(sorted_keys.rbegin(), sorted_keys.rend());
    } else {
        sort(sorted_keys.begin(), sorted_keys.end());
    }
    for (const string& key : sorted_keys) {
        cout << key << " ";
    }
    cout << endl;
}

int main() {
    string input;
    getline(cin, input);
    istringstream iss(input);
    vector<string> arr{istream_iterator<string>{iss}, istream_iterator<string>{}};

    map<string, int> d;
    for (const string& fruit : arr) {
        d[fruit]++;
    }

    printDictSorted(d);
    printDictSorted(d, true);

    return 0;
}
