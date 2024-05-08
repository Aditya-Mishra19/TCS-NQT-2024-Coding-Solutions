def findMajorityElement(arr, N):
    freq = {}
    for n in arr:
        num = int(n)
        if num in freq:
            freq[num] += 1 
        else:
            freq[num] = 1
    for key, val in freq.items():
        if val >= N // 3:
            print(key, end=" ")


def findMajorityElementInt(arr, N):
    freq = {}
    for num in arr:
        if num in freq:
            freq[num] += 1 
        else:
            freq[num] = 1
    for key, val in freq.items():
        if val >= N // 3:
            print(key, end=" ")
    

def input_array_format():
    print("\n[e1,e2,e3]")
    arr = list(map(str, input().strip("[]").split(',')))
    findMajorityElement(arr, len(arr))

def input_space_separated():
    print("\nCase 2: space separated")
    arr = list(map(int, input().split()))
    findMajorityElementInt(arr, len(arr))


input_array_format()
input_space_separated()