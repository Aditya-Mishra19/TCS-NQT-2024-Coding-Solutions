def isPrime(number):
    if number <= 1: 
        return False
    if number <= 3:
        return True
    if number % 2 == 0 or number % 3 == 0:
        return False
    i = 5
    while i * i <= number:
        if number % i == 0 or number % (i + 2) == 0:
            return False
        i += 6
    return True

def calculateSum(n):
    sum = 0
    while n > 0:
        num = n % 10 
        sum += num 
        n /= 10
    if isPrime(sum):
        return True
    else:
        return False
        
n, m = map(int, input().split())
for i in range(n, m+1):
    if isPrime(i) and calculateSum(i):
        print(i)
    