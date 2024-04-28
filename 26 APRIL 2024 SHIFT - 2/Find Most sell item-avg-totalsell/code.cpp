#include <iostream>
#include <string>
#include <map>

using namespace std;

int main() {
    int n;
    cin >> n;

    // Method 1
    int maxCost = 0;
    string maxCostItem = "";
    double totalPrice = 0;
    double avg = 0;

    for (int i = 0; i < n; i++) {
        string item;
        int quantity, price;
        cin >> item >> quantity >> price;

        totalPrice += quantity * price;
        if (totalPrice > maxCost) {
            maxCostItem = item;
        }
        avg = totalPrice / (i + 1);
    }

    cout << "Task 1 - Item: " << maxCostItem << "\nTotal price: " << fixed << totalPrice << "\nAverage Price: " << avg << endl;

    // Method 2
    map<string, double> store;
    maxCost = 0;
    maxCostItem = "";
    totalPrice = 0;

    for (int i = 0; i < n; i++) {
        string item;
        int quantity, price;
        cin >> item >> quantity >> price;
        totalPrice = quantity * price;
        store[item] += totalPrice;

        if (maxCost < store[item]) {
            maxCostItem = item;
            maxCost = store[item];
        }
    }

    double total = 0;
    for (auto& pair : store) {
        total += pair.second;
    }
    avg = total / n;

    cout << "\nTask 2 - Item: " << maxCostItem << "\nTotal price: " << fixed << total << "\nAverage Price: " << avg << endl;

    return 0;
}
