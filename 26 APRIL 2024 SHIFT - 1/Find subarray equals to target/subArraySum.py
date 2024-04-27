def bruteFroce(arr, n, target):
    for i in range(n):
        curSum = 0
        for j in range(i, n):
            curSum += arr[j]
            if curSum == target:
                print(arr[i:j+1])

def optimalApp (arr, n, target):
    sumMap = {}
    curSum = 0
    for i in range(n):
        curSum += arr[i]
        if curSum == target:
            print(arr[:i+1])
        if curSum - target in sumMap:
            startIndex = sumMap[curSum - target]+1
            print(arr[startIndex : i ])
        sumMap[curSum] = i 

arr = [3, 4, -7, 1, 3, 3, 1, -4]
N = len(arr)
target = 7 
# bruteFroce(arr, N, target)
optimalApp(arr, N, target)
