s = input()
l = s.split()
k, N = int(l[0]), int(l[1])
arr = []
for i in range(2, len(l), 2):
    marks, name = int(l[i]), l[i+1]
    arr.append((marks, name))
sorted_array = sorted(arr, key=lambda x: x[0], reverse=True)

for top in range(k):
    marks, name = sorted_array[top]
    print("{}: {}".format(name, marks))
