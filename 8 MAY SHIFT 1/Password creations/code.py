def add_value_to_chars(input_str, value):
    result = ""
    for char in input_str:
        if char.isalpha():
            if char.islower():
                result += chr(((ord(char) - ord('a') + value) % 26) + ord('a'))
            else:
                result += chr(((ord(char) - ord('A') + value) % 26) + ord('A'))
        elif char.isdigit():
            result += str((int(char) + value) % 10)
        else:
            if char == '@':
                result += '#'
            else: 
                result += '@'
    return result

input_str = input()
value = int(input())

output_str = add_value_to_chars(input_str, value)
print("Output:", output_str)
