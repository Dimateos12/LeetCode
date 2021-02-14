class Solution(object):
    def maximumWealth(self, accounts):
        teraz, ost = 0, 0 
        for i in accounts:
            for j in i: 
                teraz+=j
                
            ost = max(teraz,ost)
            teraz = 0
        return ost