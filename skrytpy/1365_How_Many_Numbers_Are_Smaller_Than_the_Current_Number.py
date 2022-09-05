class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        answer = []
        counter = 0
        for i in range(len(nums)):
            for j in range(len(nums)):
                if nums[i] > nums[j]:
                    
                    counter = counter + 1
            if counter == 0:
                answer.append(0)
            else:
                answer.append(counter)
            counter = 0
        
        return answer
