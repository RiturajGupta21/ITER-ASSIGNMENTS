min = int(input("Enter minutes "))
days=min/(24*60)
year =days/365
days=days%365
print(min," minutes is approximately ",int(year)," years and ",int(days)," days")