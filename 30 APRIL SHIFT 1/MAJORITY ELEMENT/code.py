def findMajorityElement(arr, N):
    freq = {}
    for num in arr:
        if num in freq:
            freq[num] += 1 
        else:
            freq[num] = 1
    for key, val in freq.items():
        if val >= N // 2:
            print(key, end = " ")
    

N = int(input())
array = list(map(int, input().split()))
findMajorityElement(array, N)