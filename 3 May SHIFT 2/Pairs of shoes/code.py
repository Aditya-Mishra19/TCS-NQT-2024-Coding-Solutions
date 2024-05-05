N = int(input())
l = list(map(str, input().split()))
store = {}
for shoeSize in l:
    if shoeSize in store:
        store[shoeSize] += 1 
    else:
        store[shoeSize] = 1

pairs = 0
for key, val in store.items():
    if key[-1] == 'L':
        val = key[:-1] + 'R'
        if val in store:
            pairs += min(store[key], store[val])
    else:
        val = key[:-1] + 'L'
        if val in store:
            pairs += min(store[key], store[val])
print(pairs // 2) 
