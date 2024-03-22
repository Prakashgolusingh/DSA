
/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Tree {
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum = 0;
        while(!q.isEmpty())
        {
            Node temp = q.remove();
            if(temp == null)
            {
                arr.add(sum);
                sum = 0;
                if(q.isEmpty())
                    return arr;
                q.add(null);
            }
            else
            {
                while(temp != null)
                {
                    sum += temp.data;
                    if(temp.left != null)
                        q.add(temp.left);
                    temp = temp.right;
                }
            }
        }
        return arr;
    }
}
