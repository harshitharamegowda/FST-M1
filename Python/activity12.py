def calculateSum(num):
    if num == 1:
        return 1
    else:
        return calculateSum(num - 1) + num

res = calculateSum(10)
print(res)
