#include <iostream>
#include <vector>

using namespace std;

vector<char> sortBySwap(vector<char>& arr, int N) {
    int left = 0;
    int mid = 0;
    int right = N - 1;
    while (mid <= right) {
        if (arr[mid] == '3') {
            swap(arr[left], arr[mid]);
            left++;
            mid++;
        } else if (arr[mid] == '6') {
            mid++;
        } else if (arr[mid] == '7') {
            swap(arr[right], arr[mid]);
            right--;
        }
    }
    return arr;
}

int main() {
    cout << "\nEnter space-separated elements: ";
    vector<char> arr;
    char c;
    while (cin >> c) {
        arr.push_back(c);
    }
    arr = sortBySwap(arr, arr.size());
    for (char c : arr) {
        cout << c << " ";
    }
    return 0;
}
