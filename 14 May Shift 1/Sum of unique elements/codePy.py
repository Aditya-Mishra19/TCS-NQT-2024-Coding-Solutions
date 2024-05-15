nums = list(map(int, input().split()))
d = {}
for i in range(len(nums)):
    if nums[i] not in d:
        d[nums[i]] = 1
    else:
        d[nums[i]] += 1
ans = 0
for i in d.keys():
    if d[i] == 1:
        ans+=i
print(ans)