a=int(input())
b=2
c=0
noprimes=set(j for i in range(2,8) for  j in range(i*2,50,i))
primes=[x for x in range(2,a) if x not in noprimes]
print(primes)
for i in primes:
   b=b+i
   if b in primes:
       c=c+1
       print(b)
print(c)
