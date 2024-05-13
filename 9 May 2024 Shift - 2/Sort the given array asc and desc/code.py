from collections import defaultdict

def printDictSorted(mydict, reverse=False):
    sorted_keys = sorted(mydict.keys(), reverse=reverse)
    for key in sorted_keys:
        print(key, end=" ")
    print()

arr = input().split()

d = defaultdict(int)
for fruit in arr:
    d[fruit] += 1

printDictSorted(d)
printDictSorted(d, reverse=True)
