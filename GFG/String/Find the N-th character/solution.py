#User function Template for python3

class Solution:
    def nthCharacter(self, s, r, n):
        for i in range(0, r):
            str = ""
            x = n
            for j in range(0,x+1):
                if s[j] == '1':
                    str += '10'
                else:
                    str += '01'
            s = str
            #print(str+" "+ s, end='\n')
        return s[n]
                
