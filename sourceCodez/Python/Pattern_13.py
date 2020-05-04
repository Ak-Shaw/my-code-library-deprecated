'''
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
'''

for i in range (0,5,1):
    for j in range (0,5,1):
        if j<i:
            print(end = " ")
        else:
            print(end = "* ")
    print()