def getMissingNumIntFormat(arr, size):
    totalSum = 0
    n = size + 1
    for num in arr:
        totalSum += num 
    
    actualSum = int((n * (n + 1) )/ 2)
    return actualSum - totalSum


def intFormat():
    N = int(input())
    arr = list(map(int, input().split()))
    print(getMissingNumIntFormat(arr, N))

def getMissingNumStrFormat(arr, size):
    totalSum = 0
    for num_str in arr:  
        num = int(num_str)
        totalSum += num 
    n = size + 1
    actualSum = int((n * (n + 1)) / 2)
    return actualSum - totalSum

def strFormat():
    N = int(input())
    arr = list(map(str, input().split(',')))
    print(getMissingNumStrFormat(arr, N))


intFormat()
strFormat()