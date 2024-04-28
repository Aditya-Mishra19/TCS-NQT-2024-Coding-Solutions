n = int(input())
maxCost = 0
maxCostItem = ""
totalPrice = 0
avg = 0
for i in range(n):
    item = input()
    quantity = int(input())
    price = int(input())

    totalPrice  += quantity * price 
    if totalPrice > maxCost:
        maxCostItem = item 
    avg = totalPrice / (i+1)

print("Item: {} \nTotal price: {:.2f}\n Average Price: {:.2f}".format(maxCostItem, totalPrice, avg))

store = {}
for i in range(n):
    item = input()
    quantity = int(input())
    price = int(input())
    totalPrice = quantity * price
    store[item] = store.get(item, 0) + totalPrice

total = 0
for key, val in store.items(): 
    if maxCost < val:
        maxCostItem = key
        maxCost = val 
    total += val 

average = total / n

print("Item: {} \nTotal price: {:.2f}\n Average Price: {:.2f}".format(maxCostItem, total, average))
    

    

