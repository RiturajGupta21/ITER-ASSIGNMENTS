class subset:
    def subset(self, sset):
        return self.subsets([], sorted(sset))
    def subsets(self, current, sset):
        if sset:
            return self.subsets(current, sset[1:]) + self.subsets(current + [sset[0]], sset[1:])
        return [current]
print(subset().subset([4,5,6]))
