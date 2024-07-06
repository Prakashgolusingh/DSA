class Solution:
    def passThePillow(self, n: int, time: int) -> int:
        switch = True
        count = 1
        while time>0:
            if count == 1:
                switch = True
            if count == n:
                switch = False
            if(switch):
                count += 1
            else:
                count -=1
            print(count,time)
            time -= 1
            
        return count
