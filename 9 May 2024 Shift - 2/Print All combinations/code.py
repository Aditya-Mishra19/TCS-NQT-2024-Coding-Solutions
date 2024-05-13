def printAllCombinations(arr):
    for i in range(len(arr)):
        for j in range(i + 1):
            print(*arr[j:i + 1], end="")
            if i < len(arr) - 1 or j < i:
                print(",", end="")
    

s = input("Enter space-separated numbers: ")
l = s.split()
N = l[0]
printAllCombinations(l[1:])
