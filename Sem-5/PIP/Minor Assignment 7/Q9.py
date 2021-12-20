vehicles = {'Bicycle', 'Scooter', 'Car', 'Bike', 'Truck', 'Bus', 'Rickshaw'}
heavyVehicles = {'Truck', 'Bus'}
lightVehicles = {'Rickshaw', 'Scooter', 'Bike', 'Bicycle'}

# (a)
lytVehicles = vehicles - heavyVehicles
print(lytVehicles)

# (b)
hvyVehicles = vehicles - lightVehicles
print(hvyVehicles)

# (c)
averageWeightVehicles = lytVehicles & hvyVehicles
print(averageWeightVehicles)

# (d)
transport = lightVehicles | heavyVehicles
print(transport)

# (e)
transport.add('Car')
print(transport)

# (f)
for i in vehicles:
    print(i)

# (g)
print(len(vehicles))

# (h)
print(min(vehicles))

# (i)
print(set.union(vehicles, lightVehicles, heavyVehicles))
