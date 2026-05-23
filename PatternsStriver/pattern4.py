n=int(input("Enter number of rows:"))
for i in range(n+1):
    j=1
    for j in range( 1,i + 1):
        print(i,end="")
        j+=1
    print()
