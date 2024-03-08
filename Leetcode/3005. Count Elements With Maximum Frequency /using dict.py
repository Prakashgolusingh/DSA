class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        dic = {}
        for i in nums:
            if i in dic:
                dic[i] +=1
            else:
                dic[i] = 1
        max =1
        freq = 0
        for i in dic.values():
            if max == i:
                freq +=1
            if i>max:
                max = i
                freq = 1
        return max*freq
