def isArmStrongNumber(n, k):
    sum = 0
    originalNum = n
    while originalNum > 0:
        digit = originalNum % 10 
        sum += digit ** k 
        originalNum //= 10  
    
    if sum == n:
        return True 
    return False

arr = input("Enter numbers separated by commas: ").strip('[]').split(',')
flag = 0
for num_str in arr:
    num = int(num_str)
    n = len(str(num))
    if isArmStrongNumber(num, n):
        print(num, end=" ")
        flag = 1
if flag == 0:
    print("No Armstrong numbers present")
