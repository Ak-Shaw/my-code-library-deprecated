#To demonstrate break and continue statements.

n = 5

print("----Demo of break----\n")
for i in range(n):
	
	if (i == 2):
		break

	print(i)

print("----Demo of continue----\n")
for i in range(n):
	
	if (i == 2):
		continue

	print(i)