'''
    * 
   * * 
  *   * 
 *     * 
* * * * * 
'''
s1=4
s2=-2
for i in range (5):
    print(s1*" ",end="")
    print(end="* ")
    if(i<4):
        print(s2*" ",end="")
    else:
        print(3*"* ",end="")
    if(i>0):
        print("*",end="")
    print()
    s1=s1-1
    s2=s2+2