#WAP(Write A Program) to execute a specfc action until the user declines

'''
imagine the scenario of a hospital where patients will enter until the
reception is open
'''
n=1
c=1

while(c==1):
    print("token number",n,"please come in")
    c=int(input("Press 1(to continue) or 0(to discontnue)"))
    n=n+1
print("sorry the recption is closed")
