num_tuple = (10, 20, 33, 46, 55)
print("Given list is ", num_tuple)

# Using list filter elements divisible by 5
divisible_by_5 = [num for num in num_tuple if num % 5 == 0]

print("Elements that are divisible by 5:")
for num in divisible_by_5:
    print(num)
