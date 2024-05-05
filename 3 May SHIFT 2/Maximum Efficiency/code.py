N = int(input())
arr = list(map(int, input().split()))
arr.sort()

#Max values
emp1 = arr[N-1]
emp2 = arr[N-2]
emp3 = arr[N-3]

#negative case
neg1 = arr[0]
neg2 = arr[1]

print(max(emp1 * emp2 * emp3, neg1 * neg2 * emp1))
