n=int(input("Enter the number of rows: "))
for i in range(n+1):
    for j in range(0,n-i+1):
        print(" ",end="")
    for j in range(i+1):
        print(chr(65+j),end="")
    for j in range(n-i,0):
        print(chr(65+j),end="")
    print()

