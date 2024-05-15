#include <bits/stdc++.h>

double calculate_total_cost(int weight, int distance) {
    double base_money = 5.00;
    double cost_per_kg = 2.00;
    double cost_per_10_km = 0.50;
    
    double weight_cost = weight * cost_per_kg;
    double distance_cost = (distance / 10) * cost_per_10_km;
    
    double total_cost = base_money + weight_cost + distance_cost;
    return total_cost;
}

int main() {
    int weight, distance;
    
    std::cin >> weight;
    std::cin >> distance;
    
    double total_cost = calculate_total_cost(weight, distance);
    
    char output[50];
    sprintf(output, "$%.2f", total_cost);
    
    std::cout << output << std::endl;
    
    return 0;
}
