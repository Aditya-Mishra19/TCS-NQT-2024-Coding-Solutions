def solve(arr, N):
    result = []
    for num in arr:
        if num % 3 == 0 and num % 5 == 0:
            print("ThreeFive", end = " ")
        elif num % 5 == 0:
            print("Five", end = " ")
        elif num % 3 == 0:
            print("Three", end = " ")
        else:
            print(num, end = " ")

def input_array_format1():
    N = int(input())
    arr = list(map(int, input().strip('[]').split()))
    solve(arr,N)

input_array_format1()