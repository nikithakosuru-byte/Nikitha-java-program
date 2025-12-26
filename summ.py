def missing(n,array):
    summ=0
    for i in array:
        summ=summ+i
        print(summ)
    actual_sum=((n+1)*(n+2))//2
    diff=summ-actual_sum
    return diff
    
    
    
    
    
    
n=int(input())
array=list(map(int,input().split()))
print(missing(n,array))