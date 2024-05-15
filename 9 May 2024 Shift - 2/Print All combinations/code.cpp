#include <iostream>
#include <sstream>
#include <vector>

int main() {
    std::string input;
    std::getline(std::cin, input);
    std::istringstream iss(input);
    
    int n;
    iss >> n;
    
    std::vector<int> arr;
    int temp;
    while (iss >> temp) {
        arr.push_back(temp);
    }
    
    for (int i = 0; i < n; ++i) {
        for (int j = i; j < n; ++j) {
            for (int q = i; q <= j; ++q) {
                std::cout << arr[q];
                if (q != j)
                    std::cout << " ";
            }
            if (i != n - 1)
                std::cout << ",";
        }
    }

    return 0;
}
