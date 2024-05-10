def custom_round(number):
    integer_part = int(number)
    decimal_part = number - integer_part

    if decimal_part >= 0.5:
        return integer_part + 1
    else:
        return integer_part


x = int(input())
y = int(input())
nearest = x / y
rounded_number = custom_round(nearest)
print(rounded_number * y)  
