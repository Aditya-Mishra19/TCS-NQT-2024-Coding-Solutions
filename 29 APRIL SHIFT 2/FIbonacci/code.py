def fibonacci(n):
    prev2, prev = 0, 1
    if n == 0:
        return prev2 
    if n == 1:
        return prev 
    fibSum = 1
    for i in range(2, n):
        cur = prev2 + prev 
        fibSum += cur
        print("FibSum: ", fibSum)
        prev2, prev = prev, cur
    return fibSum

n = int(input())
print(fibonacci(n))