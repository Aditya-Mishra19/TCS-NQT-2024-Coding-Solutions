gradeTotal, totalFemale = 0, 0
ans = []
for _ in range(int(input())):
    # name = input()
    # age = int(input())
    # grade = input()
    # gender = input()
    
    s = input()
    l = s.split(" ")
    name, age, grade, gender = l[0], int(l[1]), l[2], l[3]
    if age > 20:
        ans.append(name)
    if gender == "Female":
        gradeTotal += ord(grade)
        totalFemale += 1
    avg =  gradeTotal / totalFemale
print(*ans)
print(avg)

