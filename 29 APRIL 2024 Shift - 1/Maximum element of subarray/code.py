import heapq
def solve(arr, k):
    ans = []
    for i in range(len(arr) - k + 1):
        maxi = arr[i]
        for j in range(i, i+k):
            maxi = max(maxi, arr[j])
        ans.append(maxi)
    print(*ans)

def optimalSolution(arr, k):
    heap = []
    ans = []

    for i in range(k):
        heapq.heappush(heap, (-arr[i], i))
    ans.append(-heap[0][0])

    for i in range(k, len(arr)):
        heapq.heappush(heap, (-arr[i], i))
        while heap[0][1] <= i - k:
            heapq.heappop(heap)
        ans.append(-heap[0][0])
    print(*ans)
    


arr = list(map(int, input().split()))
k  = int(input())
solve(arr, k)
optimalSolution(arr, k)