def findCubeSum(start, end):
    cubeSum = 0
    for i in range(start, end+1):
        cubeSum += i ** 3 # i * i * i 
    print(cubeSum)

start, end  = map(int, input().split())
# start = int(input())
# end = int(input())
findCubeSum(start, end)