# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        arr = []
        q = deque()
        if(root == None):
            return arr
        q.append(root)
        q.append(None)
        arr1 = []
        while(len(q) != 0):
            temp = q.popleft()
            if(temp == None):
            
                arr.append(arr1)
                arr1 = []
                if(len(q) ==0):
                    return arr
                q.append(None)
            else:
                arr1.append(temp.val)
                if(temp.left != None):
                    q.append(temp.left)
                if(temp.right != None):
                    q.append(temp.right)
            print(len(q))
        return arr


