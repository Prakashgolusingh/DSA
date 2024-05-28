class Solution:
    def equalSubstring(self, s: str, t: str, maxCost: int) -> int:
        left, right, sum, ans = 0, 0, 0, 0
        while right < len(s):
            sum += abs(ord(s[right])-ord(t[right]))
            while left <= right and sum> maxCost:
                sum = sum - abs(ord(s[left])-ord(t[left]))
                left += 1
            if (right-left) >= ans:
                ans = 1+(right-left)
            right += 1
        return ans
