class Solution:
    def maximumImportance(self, n: int, roads: List[List[int]]) -> int:
        arr = [0]*n
        for i in range(0, len(roads)):
            arr[roads[i][0]] += 1
            arr[roads[i][1]] += 1
        arr.sort()
        ans = 0
        for i in range(0, len(arr)):
            ans += arr[i]*(i+1)
        return ans
