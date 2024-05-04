#include <iostream>

bool isDivisibleByNine(int number) {
    return number % 9 == 0;
}

int main() {
    int number;
    std::cin >> number;
    if (number >= 100 && number <= 999) {
        if (isDivisibleByNine(number)) {
            std::cout << "Number " << number << " is divisible by 9" << std::endl;
        } else {
            std::cout << "Number " << number << " is not divisible by 9" << std::endl;
        }
    }

    return 0;
}
