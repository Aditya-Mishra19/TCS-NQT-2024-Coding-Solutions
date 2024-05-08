def sortBySwap(arr, N):
    left = 0
    mid = 0 
    right = N - 1 
    while mid <= right:
        if arr[mid] == '3':
            arr[left], arr[mid] = arr[mid], arr[left]
            left += 1
            mid += 1
        
        elif arr[mid] == '6':
            mid += 1

        elif arr[mid] == '7':
            arr[right], arr[mid] = arr[mid], arr[right]
            right -= 1
    return arr 

print("\nSpace separated")
arr = list(map(str, input().split()))
print(*sortBySwap(arr, len(arr)))


