'''
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
'''

s=4
e=1
for i in range (9):
    for j in range (s):
        print(end=" ")
    for j in range (e):
        print(end="* ")
    if(i<4):
            s=s-1
            e=e+1
    else:
            s=s+1
            e=e-1
    print()
