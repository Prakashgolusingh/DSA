class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        arr = [0]*len(nums)
        count = 0
        x =1
        for i in range(len(nums)):
            if nums[i] == 0:
                count += 1
            else:
                x *= nums[i]
        print(count)
        if(count > 1):
            for i in range(len(nums)):
                arr[i] = 0
                return arr
        elif(count ==1):
            for i in range(len(nums)):
                if nums[i] != 0:
                    arr[i] == 0 
                else:
                    arr[i] = x
            return arr
        else:
            for i in range(len(nums)):
                arr[i] = x//nums[i]
        return arr
