#include <iostream>
using namespace std;

string addValueToChars(string inputStr, int value) {
    string result = "";
    for (char ch : inputStr) {
        if (isalpha(ch)) {
            if (islower(ch)) {
                result += ((ch - 'a' + value) % 26) + 'a';
            } else {
                result += ((ch - 'A' + value) % 26) + 'A';
            }
        } else if (isdigit(ch)) {
            result += ((ch - '0' + value) % 10) + '0';
        } else {
            if (ch == '@') {
                result += '#';
            } else {
                result += '@';
            }
        }
    }
    return result;
}

int main() {
    string inputStr;
    int value;

    cout << "Enter input string: ";
    cin >> inputStr;
    cout << "Enter value: ";
    cin >> value;

    string outputStr = addValueToChars(inputStr, value);
    cout << "Output: " << outputStr << endl;

    return 0;
}
