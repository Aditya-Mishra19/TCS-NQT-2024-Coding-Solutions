#include <iostream>
using namespace std;

int customRound(double number) {
    int integerPart = (int) number;
    double decimalPart = number - integerPart;

    if (decimalPart >= 0.5) {
        return integerPart + 1;
    } else {
        return integerPart;
    }
}

int main() {
    int x, y;
    cin >> x;
    cin >> y;

    double nearest = (double) x / y;
    int roundedNumber = customRound(nearest);
    cout << roundedNumber * y << endl;

    return 0;
}
