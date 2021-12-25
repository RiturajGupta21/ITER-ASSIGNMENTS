def sum(n,r):
  if n == 0:
    return 0
  else:
    return pow(r,n-1)+sum(n-1,r)
print(sum(4,1/2))
