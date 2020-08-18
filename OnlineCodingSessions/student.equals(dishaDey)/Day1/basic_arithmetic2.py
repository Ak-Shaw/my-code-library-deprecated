'''
n % 10 -> extract last digit
n // 10 -> remove last digit
n / 10 -> divides the number by 10
'''

n = int(input("enter an integer: "))

print("n / 10 = ", n / 10)
print("last digit = ", n % 10)
print("on removing last digit we get = ", n // 10)