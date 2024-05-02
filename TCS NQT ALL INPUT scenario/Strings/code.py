def input_array_format():
    arr = list(map(str, input().strip("[]").split(',')))
    return arr

def input_space_separated():
    arr = list(map(str, input().split()))
    return arr

def input_array_size_not_given():
    arr = []
    while True:
        element = input().strip()
        if not element:
            break
        arr.append(element)
    return arr

def main():
    # Case 1: ['A', 'B', 'C', 'D']
    print("Case 1: ['A', 'B', 'C', 'D']")
    print(input_array_format())

    # Case 2: A B C D, Case with size not given
    print("Case 2: A B C D, Case with size not given")
    print(input_space_separated())

if __name__ == "__main__":
    main()
