def generate_sequence(n):
    sequence = [n]
    while n != 1:
        if n % 2 == 0:
            n //= 2
        else:
            n = 3 * n + 1
        sequence.append(n)
    return sequence


def max_length_of_sequence_and_k(n):
    maxLen = 0
    kValue = 0
    for i in range(1, n+1):
        sequence = generate_sequence(i)
        currLen = len(sequence)
        if currLen > maxLen:
            maxLen = currLen
            kValue = i 
    return maxLen, kValue


def max_sequence_value_and_k(n):
    max_k = 0
    max_val = 0
    for k in range(1, n + 1):
        sequence = generate_sequence(k)
        max_val_k = max(sequence)
        if max_val_k > max_val:
            max_val = max_val_k
            max_k = k
    return max_val, max_k


num = input()
if num.isdigit() and int(num) > 0:
    n = int(num)
    sequence = generate_sequence(n)
    max_val, max_k = max_sequence_value_and_k(n)
    max_length_of_sequence, k_value = max_length_of_sequence_and_k(n)
    print(sequence)
    print(max_length_of_sequence, k_value)
    print(max_val, max_k)
else:
    print("Error!")
