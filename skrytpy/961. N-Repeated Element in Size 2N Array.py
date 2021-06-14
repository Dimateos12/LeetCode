class Solution(object):
    def repeatedNTimes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)/2 #Wartość n ile sie powtarza 
        i = 0 
        counter = 0 
        for x in nums[:]:
            counter = 0 
            for k in nums[:]:
                if x == k:
                    counter +=1
                if counter == n:
                    return x 