# cook your dish here
t=int(input())
while t!=0:
    x,y,z=map(int,input().split())
    while z!=0:
        x-=y
        z-=1
    if(x<0):
        x=0
    print(x)
    t-=1
