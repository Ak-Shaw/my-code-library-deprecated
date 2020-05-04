#number to words (range 0-10000000000)

def hundreds(n):
    
    a =['one','two','three','four','five','six','seven','eight','nine']
    b =['ten','eleven','twelve','thirteen','fourteen','fifteen','sixteen','seventeen','eighteen','nineteen']
    c =['twenty','thirty','forty','fifty','sixty','seventy','eighty','ninety']
    
    d=n//100
    if d>0:
        print(a[d-1]+' hundred ',end='')
    
    
    n%=100
    if(n>0 and n<10):
        print(a[n-1]+' ',end='')
    elif n>9 and n<20:
        print(b[n-10]+' ',end='')
    elif n>19 and n<100:
        t=n//10
        print(c[t-2],end=' ')
        o=n%10
        if(o>0):
            print(a[o-1]+' ',end='')
    
a =['one','two','three','four','five','six','seven','eight','nine','ten']
s=input()
n=int(s)
if n<0 or n>10000000000:
    exit()
if n==0:
    print('zero')
else:
    l=len(s)
    if l>9:
        b=int(s[:-9])
        print(a[b-1]+' billion ',end='')
        
        n=int(s[-9:])
        s=str(n)
    l=len(s)
    if(l==8):
        s='0'+s
    if l==7:
        s='00'+s
    l=len(s)
    if l==9:
        m=int(s[:3])
        hundreds(m)
        print('million ',end='')
        n=int(s[-6:])
        s=str(n)
    l=len(s)
    if l==5:
        s='0'+s
    if l==4:
        s='00'+s
    l=len(s)
    if l==6:
        m=int(s[:3])
        hundreds(m)
        print('thousand ',end='')
        n=int(s[-3:])
        s=str(n)
    l=len(s)
    if l==2:
        s='0'+s
    if l==1:
        s='00'+s
    l=len(s)
    if l==3:
        m=int(s)
        hundreds(m)
    
    
    
    
    
    
    
    
    
    
    
    