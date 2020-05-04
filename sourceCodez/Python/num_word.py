#number to words (range 0-999)

def hundreds(n):
    
    a =['one','two','three','four','five','six','seven','eight','nine']
    b =['ten','eleven','twelve','thirteen','fourteen','fifteen','sixteen','seventeen','eighteen','nineteen']
    c =['twenty','thirty','forty','fifty','sixty','seventy','eighty','ninty']
    
    d=n//100
    if d>0:
        print(a[d-1]+' hundred ',end='')
    
    
    n%=100
    if(n>0 and n<10):
        print(a[n-1])
    elif n>9 and n<20:
        print(b[n-10])
    elif n>19 and n<100:
        t=n//10
        print(c[t-2],end=' ')
        o=n%10
        if(o>0):
            print(a[o-1])
    

n=int(input())
if n==0:
    print('zero')
else:
    hundreds(n)