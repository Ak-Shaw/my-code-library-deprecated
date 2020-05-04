'''
n=5

1
10
101
1010
10101

'''
'''starting index'''
#si=int(i*(i+1)/2-1)
'''================='''
'''ending position'''
#ep=int((i+1)*(i+2)/2-2)
'''====================='''

n=int(input('size :'))
s=''''''
for i in range(n):
    if(i%2==0):
        q='1'
    else:
        q='0'
    s+=s[int(i*(i+1)/2-1):int((i+1)*(i+2)/2-2)]+q+'\n'
print(s)
    