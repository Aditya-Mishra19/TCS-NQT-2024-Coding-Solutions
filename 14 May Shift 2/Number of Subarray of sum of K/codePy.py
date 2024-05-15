def subarray_sum(arr, k):
    mpp = {0: 1}
    pre_sum = 0
    cnt = 0
    
    for num in arr:
        pre_sum += num
        rest = pre_sum - k
        cnt += mpp.get(rest, 0)
        mpp[pre_sum] = mpp.get(pre_sum, 0) + 1
    
    return cnt


arr = list(map(int, input().split()))
k = int(input())

result = subarray_sum(arr, k)
print(result)
