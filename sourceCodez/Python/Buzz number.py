#Buzz number
'''
a buzz number is a number which is divisible by 7 or 
contains 7 as the last digit
'''
n=int(input('enter a number:'))
if(n%7==0):
    print("buzz")
elif(n%10==7):
    print("buzz")
else:
    print("not buzz")