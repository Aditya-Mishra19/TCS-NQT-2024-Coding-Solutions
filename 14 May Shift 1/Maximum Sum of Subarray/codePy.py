nums = list(map(int, input().split()))
maxSum = nums[0]
currentSum = 0
for i in range(len(nums)):
    currentSum += nums[i]
    if currentSum > maxSum:
        maxSum = max(currentSum, maxSum)
    if currentSum < 0:
        currentSum = 0
print(maxSum)