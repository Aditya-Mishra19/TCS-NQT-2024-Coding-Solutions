def calculate_total_cost(weight, distance):
    base_money = 5.00
    cost_per_kg = 2.00
    cost_per_10_km = 0.50
    
    weight_cost = weight * cost_per_kg
    distance_cost = (distance // 10) * cost_per_10_km
    
    total_cost = base_money + weight_cost + distance_cost
    return total_cost


weight = int(input())
distance = int(input())


total_cost = calculate_total_cost(weight, distance)
print(f"${total_cost:.2f}")
