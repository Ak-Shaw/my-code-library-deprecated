#counting the number of digits in a string

s=input()
count=0
for i in s:
    try:
        int(i)
        count+=1
    except ValueError:
        count+=0

print(count)
