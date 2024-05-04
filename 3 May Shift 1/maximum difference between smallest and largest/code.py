def solve(arr):
    largest, maxDiff = float('-inf'), float('-inf')
    for i in range(len(arr) - 1, -1, -1):
        num = int(arr[i])
        largest = max(largest, num)
        maxDiff = max(maxDiff, largest - num)
    return maxDiff

def solveInt(arr):
    largest, maxDiff = float('-inf'), float('-inf')
    for i in range(len(arr) - 1, -1, -1):
        num = arr[i]
        largest = max(largest, num)
        maxDiff = max(maxDiff, largest - num)
    return maxDiff

def input_array_format():
    arr = list(map(str, input().strip("[]").split(',')))
    print("\nCase 1 - [-3,-5,1,6,-7,8,11], maxdiff: ", solve(arr))

def input_space_separated():
    arr = list(map(int, input().split()))
    print("\nCase 2: -3 -5 1 6 -7 8 11, maxdiff: ", solveInt(arr))


input_array_format()
input_space_separated()