def main():
    in_str = input()
    arr = in_str.split(" ")
    n = int(arr[0])
    sb = "".join(arr[1:])
    
    for i in range(n):
        for j in range(i, n):
            for q in range(i, j + 1):
                if q != j:
                    print(sb[q], end=" ")
                else:
                    print(sb[q], end="")
            if i != n - 1:
                print(",", end="")
    print()

if __name__ == "__main__":
    main()
