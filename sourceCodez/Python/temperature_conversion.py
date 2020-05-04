#temperature conversion

print('press 1 to convert from farenheit to celsius')
print('press 2 to convert from celsius to farenheit')
o=input('enter your choice :')
o=int(o)
if(o==1):
    f=input('enter temperature in farenheit :')
    f=int(f)
    c=5*(f-32)/9
    print('temperature in celsius :',c)
elif(o==2):
    c=input('enter temperature in celsius :')
    c=int(c)
    f=9*c/5+32
    print('temperature in farenheit :',f)
else :
    print('invalid option')